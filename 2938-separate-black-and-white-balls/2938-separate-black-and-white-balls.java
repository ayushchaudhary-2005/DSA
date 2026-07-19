class Solution {
    public long minimumSteps(String s) {
        long ans=0;
        int i=0,j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(ch=='0'){
                ans=ans+(j-i);
                i++;
            }
            j++;
        }
        return ans;
        
    }
}