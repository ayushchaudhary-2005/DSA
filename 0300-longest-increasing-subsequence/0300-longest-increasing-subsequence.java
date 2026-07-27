class Solution {
    public int find(int arr[],int idx,int prevIdx,int dp[][]){
        if(idx==arr.length){
            return 0;
        }
        if(prevIdx>=0 && dp[idx][prevIdx]!=-1){
            return dp[idx][prevIdx];
        }
        int take=0;
        if(prevIdx==-1 || arr[prevIdx]<arr[idx]){
            take=1+find(arr,idx+1,idx,dp);
        }
        int notTake=find(arr,idx+1,prevIdx,dp);
        if(prevIdx>=0){
            dp[idx][prevIdx]=Math.max(take,notTake);
        }
        return Math.max(take,notTake);

    }
    public int lengthOfLIS(int[] arr) {
        int dp[][]=new int[2501][2501];
        
        for(int i=0;i<2501;i++){
            Arrays.fill(dp[i],-1);
        }
        return find(arr,0,-1,dp);
    
    }
}