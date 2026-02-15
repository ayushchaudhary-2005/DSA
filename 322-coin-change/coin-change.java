class Solution {
    public long find(int arr[],int amount,int idx,long dp[][]){
        if(idx==arr.length){
            if(amount==0){
                return 0;
            }
            return Integer.MAX_VALUE;
        }
        if(dp[idx][amount]!=-1){
            return dp[idx][amount];
        }
        long take=Integer.MAX_VALUE;
        if(arr[idx]<=amount){
            take=1+find(arr,amount-arr[idx],idx,dp);
        }
        long notTake=find(arr,amount,idx+1,dp);
        return dp[idx][amount]=Math.min(take,notTake);
        
    }
    public int coinChange(int[] arr, int amount) {
        long dp[][]=new long[arr.length][amount+1];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        long k=find(arr,amount,0,dp);
        if(k>=Integer.MAX_VALUE){
            return -1;
        } return (int)k;
        
    }
}