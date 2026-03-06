class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                int j=i+1;
                boolean found=false;
                while(j<s.length()){
                    if(s.charAt(j)=='1'){
                        found=true;
                        break;
                    }
                    j++;
                }
                if(found){
                    return false;
                }
            }
        }
        return true;
        
    }
}