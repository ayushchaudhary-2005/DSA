class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans=0;
        boolean found=false;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            int j=i+1;
            while(j<s.length()){
                if(s.charAt(j)==curr){
                    found=true;
                    ans=Math.max(ans,j-i-1);
                }
                j++;
            }
        }
        return found?ans:-1;
        
    }
}