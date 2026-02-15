class Solution {
    public int find(int arr[],int l,int r,int dp[][]){
        if(r-l<2){
            return 0;
        }
        if(dp[l][r]!=-1){
            return dp[l][r];
        }
        int res=Integer.MAX_VALUE;
        for(int i=l+1;i<=r-1;i++){
            int cost=arr[r]-arr[l]+find(arr,l,i,dp)+find(arr,i,r,dp);
            res=Math.min(res,cost);
        }
        return dp[l][r]=res;
    }
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int dp[][]=new int[103][103];
        for(int i=0;i<103;i++){
            Arrays.fill(dp[i],-1);
        } 
        int arr[]=new int[cuts.length+2];
        arr[0]=0;
        for(int i=0;i<cuts.length;i++){
            arr[i+1]=cuts[i];
        }
        arr[arr.length-1]=n;
        return find(arr,0,arr.length-1,dp);
        
    }
}