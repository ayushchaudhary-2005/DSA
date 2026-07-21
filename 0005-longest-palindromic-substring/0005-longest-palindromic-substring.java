class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=i;j--){
                if(s.charAt(i)==s.charAt(j)){
                    int k=i;
                    int l=j;
                    while(l>k && s.charAt(k)==s.charAt(l)){
                        l--;
                        k++;

                    }
                    if(k>=l){
                        if((j-i+1)>ans.length()){
                            ans=s.substring(i,j+1);
                        }
                    }

                }
            }
           
        }
        return ans;
        
    }
}