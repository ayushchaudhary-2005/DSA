class Solution {
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        int ans[]=new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[0]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{0,0});
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());

        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new int[]{edges[i][1],edges[i][2]});
            adj.get(edges[i][1]).add(new int[]{edges[i][0],edges[i][2]});
        }
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int node=curr[0];
            int wt=curr[1];
            if(wt > ans[node]) continue;          
            if(wt >= disappear[node]) continue; 
            for(int i=0;i<adj.get(node).size();i++){
                int arr[]=adj.get(node).get(i);
                int currEle=arr[0];
                int currWt=arr[1];
                if(disappear[currEle]<=wt+currWt || currWt+wt>=ans[currEle]){
                    continue;
                }
                pq.add(new int[]{currEle,currWt+wt});
                ans[currEle]=currWt+wt;
            }

        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]==Integer.MAX_VALUE){
                ans[i]=-1;
            }
        }
        return ans;
        
        
    }
}