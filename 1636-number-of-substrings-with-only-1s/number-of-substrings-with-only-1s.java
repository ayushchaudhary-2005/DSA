class Solution {
    public int numSub(String s) {
        int ans=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(ch=='1'){
                ans=(ans+(j-i+1))%1000000007;
                j++;
            }
            else{
                while(j<s.length() && s.charAt(j)=='0'){
                    j++;
                    i=j;
                }
        }}
        return ans;
        
    }
}