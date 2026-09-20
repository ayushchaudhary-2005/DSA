class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int rev=('z'-s.charAt(i))+1;
            ans=ans+(i+1)*rev;
        }
        return ans;
        
    }
}