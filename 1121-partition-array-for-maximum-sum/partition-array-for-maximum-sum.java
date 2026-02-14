class Solution {
    public int find(int arr[],int k,int idx,int dp[]){
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int currMax=-1;
        int res=0;
        for(int j=idx;j<arr.length && (j-idx+1)<=k;j++){
            currMax=Math.max(arr[j],currMax);
            res=Math.max(res,currMax*(j-idx+1)+find(arr,k,j+1,dp));

        }
        return dp[idx]=res;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        return find(arr,k,0,dp);
        
    }
}