class Solution {
    public int find(String s,String ns,int i,int j,int dp[][]){
       if(i==s.length() ||  j==s.length()){
        return 0;
       }
       if(dp[i][j]!=-1){
        return dp[i][j];
       }
       if(s.charAt(i)==ns.charAt(j)){
         return dp[i][j]=1+find(s,ns,i+1,j+1,dp);
       }
       else{
        return dp[i][j]=Math.max(find(s,ns,i+1,j,dp),find(s,ns,i,j+1,dp));
       }

    }
    public int longestPalindromeSubseq(String s) {
        if(s.length()==1){
            return 1;
        }
        StringBuilder sb=new StringBuilder(s);
        String ns=sb.reverse().toString();
        int dp[][]=new int[1001][1001];
        for(int i=0;i<1001;i++){
            Arrays.fill(dp[i],-1);
        }
        return find(s,ns,0,0,dp);

    }
}