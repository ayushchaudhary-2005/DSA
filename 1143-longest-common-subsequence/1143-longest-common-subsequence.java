class Solution {
    public int find(String text1,String text2,int i,int j,int dp[][]){
        if(i==-1 || j==-1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]=1+find(text1,text2,i-1,j-1,dp);
        }
        else{
            return dp[i][j]=Math.max(find(text1,text2,i-1,j,dp),find(text1,text2,i,j-1,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int i=text1.length()-1;
        int j=text2.length()-1;
        int dp[][]=new int[text1.length()][text2.length()];
        for(int k=0;k<text1.length();k++){
            Arrays.fill(dp[k],-1);
        }
        return find(text1,text2,i,j,dp);
        
    }
}