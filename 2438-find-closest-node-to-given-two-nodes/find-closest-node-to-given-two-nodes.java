class Solution {
    public void find(int edges[],int node,int[] dist,boolean visited[]){
        visited[node]=true;
        if(edges[node]!=-1 && !visited[edges[node]]){
            dist[edges[node]]=dist[node]+1;
            find(edges,edges[node],dist,visited);

        }
        visited[node]=false;

    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int dist1[]=new int[edges.length];
        Arrays.fill(dist1,Integer.MAX_VALUE);
        int dist2[]=new int[edges.length];
        Arrays.fill(dist2,Integer.MAX_VALUE);
        dist1[node1]=0;
        dist2[node2]=0;
        boolean visited[]=new boolean[edges.length];
        find(edges,node1,dist1,visited);
        find(edges,node2,dist2,visited);
        int ans=-1;
        int maxDist=Integer.MAX_VALUE;
        for(int i=0;i<dist1.length;i++){
            int d1=dist1[i];
            int d2=dist2[i];
            int mD=Math.max(d1,d2);
            if(mD<maxDist){
                maxDist=mD;
                ans=i;
            }


        }
        return ans;
        
    }
}