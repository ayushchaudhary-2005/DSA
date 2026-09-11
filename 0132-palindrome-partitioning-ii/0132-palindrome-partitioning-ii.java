class Solution {
    public boolean isValid(String str,int s,int e){
        if(e==s){
            return true;
        }
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            e--;
            s++;
        }
        return true;

    }
    public int find(String s,int idx,int dp[]){
        if(s.length()==idx){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=idx;i<s.length();i++){
            int cuts=0;
            if(isValid(s,idx,i)){
                cuts=1+find(s,i+1,dp);
                ans=Math.min(ans,cuts);
            }

        }
        return dp[idx]=ans;
    }
    public int minCut(String s) {
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        return find(s,0,dp)-1;
        
    }
}