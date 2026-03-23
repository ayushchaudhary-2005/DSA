class Solution {
    public int find(int n,int dp[]){
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int res=1;
        for(int i=1;i<n;i++){
            int br=i*find(n-i,dp);
            int noBreak=i*(n-i);
            res=Math.max(res,Math.max(br,noBreak));
        }
        return dp[n]=res;
    }
    public int integerBreak(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
       return find(n,dp);
        
    }
}