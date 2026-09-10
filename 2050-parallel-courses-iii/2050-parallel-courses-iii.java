class Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int indeg[]=new int[n];
        for(int i=0;i<relations.length;i++){
            int u=relations[i][0]-1;
            int v=relations[i][1]-1;
            indeg[v]++;
            adj.get(u).add(v);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        int ans=0;
        int courseTime[]=new int[n];
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr=q.poll();
                for(int j=0;j<adj.get(curr).size();j++){
                    indeg[adj.get(curr).get(j)]--;
                    courseTime[adj.get(curr).get(j)]=Math.max(courseTime[adj.get(curr).get(j)],courseTime[curr]+time[curr]);
                    if(indeg[adj.get(curr).get(j)]==0){
                        q.add(adj.get(curr).get(j));
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            ans=Math.max(ans,courseTime[i]+time[i]);
        }
        return ans;
        
    }
}