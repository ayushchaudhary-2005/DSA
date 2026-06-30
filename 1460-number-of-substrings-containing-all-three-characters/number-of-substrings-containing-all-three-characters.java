class Solution {
    public int numberOfSubstrings(String s) {
        int ac=0;
        int bc=0;
        int cc=0;
        int ans=0;
        int st=0;
        int e=0;
        while(e<s.length()){
            char ch=s.charAt(e);
            if(ch=='a'){
                ac++;
            }
            else if(ch=='b'){
                bc++;
            }
            else if(ch=='c'){
                cc++;
            }
            if(ac>=1 && bc>=1 && cc>=1){
                while(st<e && ac!=0 && bc!=0 && cc!=0){
                    if(s.charAt(st)=='a'){
                        ac--;
                    }
                    if(s.charAt(st)=='b'){
                        bc--;
                    }
                    if(s.charAt(st)=='c'){
                        cc--;
                    }
                    st++;
                    ans=ans+(s.length()-e);
                    
                }
            }
            e++;
        }
        return ans;
        
    }
}