class Solution {
     int ans=Integer.MAX_VALUE;
    public void find(int r,int c,int mat[][],int target,int currSum,boolean dp[][]){
        if(r==mat.length){
             if(Math.abs(currSum-target)<ans){
                ans=Math.abs(currSum-target);
            }
            return;
        }
        if(dp[r][currSum]!=false){
            return;
        }
        dp[r][currSum]=true;
        for(int col=0;col<mat[0].length;col++){
            find(r+1,col,mat,target,currSum+mat[r][col],dp);
        }
    }
    public int minimizeTheDifference(int[][] mat, int target) {
        boolean[][] dp=new boolean[mat.length][5000];
        for(int i=0;i<mat[0].length;i++){
           find(1,i,mat,target,mat[0][i],dp);
        }
        return ans;
        
    }
}