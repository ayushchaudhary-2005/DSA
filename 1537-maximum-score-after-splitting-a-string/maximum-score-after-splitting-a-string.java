class Solution {
    public int maxScore(String s) {
        int left[]=new int[s.length()];
        int zc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zc++;
            }
            left[i]=zc;
        }
        int right[]=new int[s.length()];
        int oc=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                oc++;
            }
            right[i]=oc;
        }
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            ans=Math.max(ans,left[i]+right[i+1]);
        }
        return ans;
        
    }
}