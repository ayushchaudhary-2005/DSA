class Solution {
    public double find(int n,int k,int r,int c,double dp[][][]){
        if(r<=-1 || r>=n || c<=-1 || c>=n || k==-1){
            return 0;
        }
        if(dp[r][c][k]!=-1){
            return dp[r][c][k];
        }
        if(k==0){
            return 1;
        }
        return dp[r][c][k]=(find(n,k-1,r-2,c-1,dp)+find(n,k-1,r-2,c+1,dp)+find(n,k-1,r-1,c-2,dp)+find(n,k-1,r+1,c-2,dp)+
               find(n,k-1,r+2,c-1,dp)+find(n,k-1,r+2,c+1,dp)+find(n,k-1,r-1,c+2,dp)+find(n,k-1,r+1,c+2,dp))/8;
    }
    public double knightProbability(int n, int k, int row, int column) {
        double dp[][][]=new double[26][26][101];
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return find(n,k,row,column,dp);
        
    }
}