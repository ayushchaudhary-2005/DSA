class Solution {
    public boolean find(int arr[],int idx,int k,Boolean dp[][]){
        if(idx>=arr.length-1){
            return true;
        }
        if(dp[idx][k]!=null){
            return dp[idx][k];
        }
        boolean km1=false;
        boolean km2=false;
        boolean km3=false;
       for(int i=idx+1;i<arr.length;i++){
        int diff=arr[i]-arr[idx];
        if(k-1>0 && diff==k-1){
            km1=find(arr,i,k-1,dp);
        }
        if(diff==k){
            km2=find(arr,i,k,dp);
        }
        if(diff==k+1){
            km3=find(arr,i,k+1,dp);
        }
        }
        return dp[idx][k]=km1||km2||km3;
    }
    public boolean canCross(int[] arr) {
        Boolean dp[][]=new Boolean[arr.length][arr.length];
        return find(arr,0,0,dp);
        
    }
}