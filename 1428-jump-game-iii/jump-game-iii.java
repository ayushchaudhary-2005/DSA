class Solution {
    class Pair{
        int val;
        int idx;
        public Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public boolean canReach(int[] arr, int start) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(arr[start],start));
        boolean visited[]=new boolean[arr.length];
        visited[start]=true;
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int val=curr.val;
            int idx=curr.idx;
            if(val==0){
                return true;
            }
            if(idx+val<arr.length && !visited[idx+val]){
                q.add(new Pair(arr[val+idx],val+idx));
                visited[val+idx]=true;
            }
            if(idx-val>=0 && !visited[idx-val]){
                q.add(new Pair(arr[idx-val],idx-val));
                visited[idx-val]=true;
            }

        }
        return false;
        
        
    }
}