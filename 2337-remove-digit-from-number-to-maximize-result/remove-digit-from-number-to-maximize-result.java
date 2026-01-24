class Solution {
    String ans="";
    public void find(String number,char digit,int operation,int idx){
        if(idx==number.length()){
            return;
        }
        if(number.charAt(idx)==digit){
            String remStr=number.substring(0,idx)+number.substring(idx+1,number.length());
            if(ans.equals("")){
                ans=remStr;
            }
            else{
                if(ans.compareTo(remStr)<0){
                    ans=remStr;
                }
            }

        }
        find(number,digit,operation,idx+1);
    }
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
            find(number,digit,0,0);
            return ans;
            
        
    }
}}