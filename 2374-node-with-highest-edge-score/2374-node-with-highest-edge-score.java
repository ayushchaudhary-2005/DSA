class Solution {
    public int edgeScore(int[] edges) {
        long sum[]=new long[edges.length];
        for(int i=0;i<edges.length;i++){
            sum[edges[i]]+=i;
        }
        long ans=sum[0];
        int node=0;
        for(int i=1;i<edges.length;i++){
            if(ans<sum[i]){
                ans=sum[i];
                node=i;
            }
        }
        return node;
        
    }
}