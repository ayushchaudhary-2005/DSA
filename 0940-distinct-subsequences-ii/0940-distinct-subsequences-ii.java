class Solution {
    public int distinctSubseqII(String s) {
        int mod=1000000007;
        long dp[]=new long[s.length()+1];
        int last[]=new int[26];
        dp[0]=1;
        for(int i=1;i<=s.length();i++){
            char ch=s.charAt(i-1);
            dp[i]=(2*dp[i-1])%mod;
            if(last[ch-'a']!=0){
                dp[i]=((dp[i]-dp[last[ch-'a']-1])%mod+mod)%mod;
            }
            last[ch-'a']=i;

        }
        return (int)(((dp[s.length()]-1)%mod+mod)%mod);
        
        
    }
}