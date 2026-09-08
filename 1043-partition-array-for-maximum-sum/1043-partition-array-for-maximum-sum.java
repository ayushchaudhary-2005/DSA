class Solution {
    public int find(int arr[],int k,int idx,int dp[]){
        if(idx>=arr.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int ans=0;
        int max=-1;
        for(int i=idx;i<Math.min(idx+k,arr.length);i++){
            max=Math.max(max,arr[i]);
            int op=(i-idx+1)*max+find(arr,k,i+1,dp);
            ans=Math.max(ans,op);
        }
        return dp[idx]=ans;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        return find(arr,k,0,dp);
        
    }
}