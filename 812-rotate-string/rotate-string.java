class Solution {
    public boolean rotateString(String s, String goal) {
        String newOne=s+s;
        if(s.length()>goal.length() || goal.length()>s.length()){
            return false;
        }
        if(newOne.contains(goal)){
            return true;
        }
        return false;
        
    }
}