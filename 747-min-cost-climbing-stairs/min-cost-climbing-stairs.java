class Solution {
    public int find(int arr[],int idx,int dp[]){
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int os=arr[idx]+find(arr,idx+1,dp);
        int ts=arr[idx]+find(arr,idx+2,dp);
        return dp[idx]=Math.min(os,ts);

    }
    public int minCostClimbingStairs(int[] arr) {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        int takeFromZero=find(arr,0,dp);
        Arrays.fill(dp,-1);
        int takeFromOne=find(arr,1,dp);
        return Math.min(takeFromZero,takeFromOne);
        
    }
}