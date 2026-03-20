class Solution {
    public int find(int arr[],int target,int idx,int cs,int dp[][]){
        if(cs==target){
            return 1;
        }
        if(cs>target){
            return 0;
        }
        if(idx==arr.length){
            return 0;
        }
        if(dp[idx][cs]!=-1){
            return dp[idx][cs];
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans+find(arr,target,i,cs+arr[i],dp);
        }
        return dp[idx][cs]=ans;
    }
    public int combinationSum4(int[] arr, int target) {
        int dp[][]=new int[arr.length][target+1];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return find(arr,target,0,0,dp);
        
    }
}