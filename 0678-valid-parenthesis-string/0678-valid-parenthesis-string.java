class Solution {
    public boolean find(String s,int idx,int op,int cp,Boolean dp[][][]){
        if(idx==s.length()){
            if(op==cp){
                return true;
            }
            return false;
        }
        if(dp[idx][op][cp]!=null){
            return dp[idx][op][cp];
        }
        if(cp>op){
            return false;
        }
        if(s.charAt(idx)=='*'){
            boolean skip=find(s,idx+1,op,cp,dp);
            boolean rightP=find(s,idx+1,op+1,cp,dp);
            boolean leftP=find(s,idx+1,op,cp+1,dp);
            return dp[idx][op][cp]=skip || leftP || rightP;
        }
        else{
            boolean rightP=false;
            boolean leftP=false;
            if(s.charAt(idx)=='('){
                rightP=find(s,idx+1,op+1,cp,dp);
            }
            else{
                leftP=find(s,idx+1,op,cp+1,dp);

            }
            return dp[idx][op][cp]=rightP||leftP;
        }

    }
    public boolean checkValidString(String s) {
        if(s.charAt(0)==')'){
            return false;
        }
        Boolean dp[][][]=new Boolean[101][101][101]; 
        return find(s,0,0,0,dp);
        
    }
}