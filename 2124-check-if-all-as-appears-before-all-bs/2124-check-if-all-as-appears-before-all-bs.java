class Solution {
    public boolean checkString(String s) {
        int bc=0;
        for(int i=0;i<s.length();i++){
            if(bc>=1 && s.charAt(i)=='a'){
                return false;
            }
            if(s.charAt(i)=='b'){
                bc++;
            }
        }
        return true;
        
    }
}