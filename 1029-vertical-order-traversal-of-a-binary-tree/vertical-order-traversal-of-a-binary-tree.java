class Solution {
    int l;
    int r;
    public void find(TreeNode root, int pos){
        if(root==null) return;

        l = Math.min(pos, l);
        r = Math.max(r, pos);
        find(root.left, pos-1);
        find(root.right, pos+1);
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        l = 0;
        r = 0;
        find(root, 0);
        int leftSize = Math.abs(l) + 1;
        int rightSize = r + 1;
         // Now we store (row, value)
        ArrayList<ArrayList<int[]>> pal = new ArrayList<>();
        for(int i=0;i<rightSize;i++){
            pal.add(new ArrayList<>());
        }
        ArrayList<ArrayList<int[]>> nal = new ArrayList<>();
        for(int i=0;i<leftSize;i++){
            nal.add(new ArrayList<>());
        }
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> rowQ = new LinkedList<>();
         q.add(root);
        pos.add(0);
        rowQ.add(0);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            int currPos = pos.poll();
            int row = rowQ.poll();
            if(currPos >= 0){
                pal.get(currPos).add(new int[]{row, curr.val});
            } else {
                nal.get(Math.abs(currPos)).add(new int[]{row, curr.val});
            }
            if(curr.left != null){
                q.add(curr.left);
                pos.add(currPos-1);
                rowQ.add(row+1);
            }
            if(curr.right != null){
                q.add(curr.right);
                pos.add(currPos+1);
                rowQ.add(row+1);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        // negative side (reverse order)
        for(int i=nal.size()-1;i>0;i--){
            ArrayList<int[]> list = nal.get(i);
            if(!list.isEmpty()){
                Collections.sort(list, (a,b) -> {
                    if(a[0] == b[0]) return a[1] - b[1]; // same row → sort by value
                    return a[0] - b[0]; // sort by row
                });
                List<Integer> temp = new ArrayList<>();
                for(int[] arr : list){
                    temp.add(arr[1]);
                }
                ans.add(temp);
            }
        }
        // positive side
        for(int i=0;i<pal.size();i++){
            ArrayList<int[]> list = pal.get(i);
            if(!list.isEmpty()){
                Collections.sort(list, (a,b) -> {
                    if(a[0] == b[0]) return a[1] - b[1];
                    return a[0] - b[0];
                });
                List<Integer> temp = new ArrayList<>();
                for(int[] arr : list){
                    temp.add(arr[1]);
                }
                ans.add(temp);
            }
        }
        return ans;
    }
}
