class Solution {
    public int find(int n,int m,int k,int searchCount,int numCount,int maxSoFar,int dp[][][]){
        if(numCount==n){
            if(searchCount==k){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(maxSoFar!=-1 && dp[numCount][maxSoFar][searchCount]!=-1){
            return dp[numCount][maxSoFar][searchCount];
        }
        int res=0;
        for(int i=1;i<=m;i++){
            if(i>maxSoFar){
                res=(res+find(n,m,k,searchCount+1,numCount+1,i,dp))%1000000007;

            }
            else{
                res=(res+find(n,m,k,searchCount,numCount+1,maxSoFar,dp))%1000000007;
            }
        }
        if(maxSoFar!=-1){
            dp[numCount][maxSoFar][searchCount]=res%1000000007;

        }
        return res%1000000007;
    }
    public int numOfArrays(int n, int m, int k) {
        int dp[][][]=new int[51][101][51];
        for(int i=0;i<=50;i++){
            for(int j=0;j<101;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return find(n,m,k,0,0,-1,dp);
        
    }
}