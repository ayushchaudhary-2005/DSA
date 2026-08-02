class Solution {
    class Pair{
        int head;
        int time;
        public Pair(int head,int time){
            this.head=head;
            this.time=time;
        }
    }
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        for(int i=0;i<manager.length;i++){
            int val=manager[i];
            if(val!=-1){
                al.get(val).add(i);
            }
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(headID,informTime[headID]));
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                Pair curr=q.poll();
                int head=curr.head;
                int time=curr.time;
                ans=Math.max(time,ans);
                for(int i=0;i<al.get(head).size();i++){
                    q.add(new Pair(al.get(head).get(i),time+informTime[al.get(head).get(i)]));
                }

            }

        }
        return ans;
        
    }
}