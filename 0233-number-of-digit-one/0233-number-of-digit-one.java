class Solution {
    public int find(String s,int idx,int tight,int cnt_of_1,int dp[][][]){
        if(idx==s.length()){
            return cnt_of_1;
        }
        if(dp[idx][tight][cnt_of_1]!=-1){
            return dp[idx][tight][cnt_of_1];
        }
        int ans=0;
        int lowerBound=0;
        int upperBound=(tight==1)?s.charAt(idx)-'0':9;
        for(int i=lowerBound;i<=upperBound;i++){
            ans=ans+find(s,idx+1,(tight==1 && upperBound==i)?1:0,((i==1)?cnt_of_1+1:cnt_of_1),dp);
        }
        return dp[idx][tight][cnt_of_1]=ans;
       
    }
    public int countDigitOne(int n) {
        String s=String.valueOf(n);
        int dp[][][]=new int[s.length()][2][11];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return find(s,0,1,0,dp);
        
    }
}