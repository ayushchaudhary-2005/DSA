class Solution {
    class Pair{
        int val;
        int idx;
        public Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0){
            return new int[0];
        }
        ArrayList<Pair> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(new Pair(arr[i],i));
        }
        Collections.sort(al,(a,b)->a.val-b.val);
        int ans[]=new int[arr.length];
        int min=1;
        ans[al.get(0).idx]=1;
        for(int i=1;i<al.size();i++){
            if(al.get(i).val==al.get(i-1).val){
                ans[al.get(i).idx]=min;
            }
            else{
                ans[al.get(i).idx]=min+1;
                min++;

            }

        }
        return ans;

        
    }
}