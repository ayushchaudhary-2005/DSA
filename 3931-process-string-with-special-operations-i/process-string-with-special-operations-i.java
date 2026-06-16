class Solution {
    public String processStr(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                ans=ans+ans;
            }
            else if(ch=='*'){
                if(ans.length()!=0){
                    ans=ans.substring(0,ans.length()-1);

                }
            }
            else if(ch=='%'){
                StringBuilder sb=new StringBuilder(ans);
                ans=sb.reverse().toString();
            }
            else{
                ans=ans+ch;
            }

        }
        return ans;
        
    }
}