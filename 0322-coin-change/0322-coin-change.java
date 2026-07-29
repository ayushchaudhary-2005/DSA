class Solution {
    public long find(int arr[],int amount,int currAmount,int idx,long dp[][]){
        if(currAmount==amount){
            return 0;
        }
        if(idx==arr.length){
            return Integer.MAX_VALUE;
        }
        if(dp[idx][currAmount]!=-1){
            return dp[idx][currAmount];
        }
        long take=Integer.MAX_VALUE;
        if(arr[idx]<=amount-currAmount){
            take=1+find(arr,amount,currAmount+arr[idx],idx,dp);
        }
        long notTake=find(arr,amount,currAmount,idx+1,dp);
        return dp[idx][currAmount]=Math.min(take,notTake);
    }
    public int coinChange(int[] arr, int amount) {
        long dp[][]=new long[arr.length][amount+1];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        long ans=find(arr,amount,0,0,dp);
        if(ans>=Integer.MAX_VALUE){
            return -1;
        }
        return (int)ans;
        
    }
}