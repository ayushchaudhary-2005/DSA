/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxVal=0;
    public void find(TreeNode root){
        if(root==null){
            return;
        }
        maxVal=Math.max(maxVal,root.val);
        find(root.left);
        find(root.right);
    }
    public int makeGraph(TreeNode root,ArrayList<ArrayList<Integer>> adj,int parent){
        if(root==null){
            return -1;
        }
        adj.get(root.val).add(parent);
        int left=makeGraph(root.left,adj,root.val);
        int right=makeGraph(root.right,adj,root.val);
        if(left!=-1){
            adj.get(root.val).add(left);

        }
        if(right!=-1){
            adj.get(root.val).add(right);
        }
        return root.val;

    }
    class Pair{
        int val;
        int time;
        public Pair(int val,int time){
            this.val=val;
            this.time=time;
        }
    }
    public int amountOfTime(TreeNode root, int start) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        find(root);
        for(int i=0;i<=maxVal;i++){
            adj.add(new ArrayList<>());
        }
        makeGraph(root,adj,-1);
        boolean visited[]=new boolean[maxVal+1];
        Queue<Pair> q=new LinkedList<>();
        int ans=0;
        q.add(new Pair(start,0));
        visited[start]=true;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair curr=q.poll();
                int val=curr.val;
                int time=curr.time;
                ans=time;
                for(int j=0;j<adj.get(val).size();j++){
                    if(adj.get(val).get(j)!=-1 && !visited[adj.get(val).get(j)]){
                        q.add(new Pair(adj.get(val).get(j),time+1));
                        visited[adj.get(val).get(j)]=true;
                    }
                }


            }
        }
        return ans;
        
    }
}