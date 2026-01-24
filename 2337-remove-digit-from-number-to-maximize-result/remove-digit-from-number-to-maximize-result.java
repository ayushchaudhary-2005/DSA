class Solution {
    public String removeDigit(String number, char digit) {
        int c=0;
        int idx=-1;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                c++;
                idx=i;
            }
        }
        if(c==1){
            StringBuilder sb=new StringBuilder(number);
            sb.deleteCharAt(idx);
            return sb.toString();
        }
        else{
            idx=-1;
            for(int i=0;i<number.length()-1;i++){
                if(number.charAt(i)==digit && number.charAt(i)<number.charAt(i+1)){
                    idx=i;
                    break;
                }
            }
            if(idx!=-1){
                StringBuilder sb=new StringBuilder(number);
                sb.deleteCharAt(idx);
                return sb.toString();
            }
            else{
                for(int i=number.length()-1;i>=0;i--){
                    if(number.charAt(i)==digit){
                        idx=i;
                        break;
                    }
                }
                StringBuilder sb=new StringBuilder(number);
                sb.deleteCharAt(idx);
                return sb.toString();
            }
        }
        
    }
}