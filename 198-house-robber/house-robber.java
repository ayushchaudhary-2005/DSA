class Solution {
    public int find(int arr[],int idx,int dp[]){
        if(arr.length<=idx){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int steal=arr[idx]+find(arr,idx+2,dp);
        int skip=find(arr,idx+1,dp);
        return dp[idx]=Math.max(steal,skip);
    }
    public int rob(int[] arr) {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        return find(arr,0,dp);
        
    }
}