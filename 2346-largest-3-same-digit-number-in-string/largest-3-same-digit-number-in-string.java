class Solution {
    public String largestGoodInteger(String num) {
        int s=0;
        int e=0;
        String ans="";
        while(e<num.length()){
            if((e-s+1)==3){
                if(num.charAt(s)==num.charAt(s+1) && num.charAt(s+1)==num.charAt(e)){
                    String ns=num.substring(s,e+1);
                    if(ans.equals("")){
                        ans=ns;
                    }
                    else{
                        if(ans.compareTo(ns)<0){
                            ans=ns;
                        }
                    }
                }
                s++;

            }
            e++;
        }
        return ans;
        
    }
}