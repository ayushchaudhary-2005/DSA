class Solution {
    public int find(char prev,String s,int idx){
        if(idx==s.length()){
            return 0;
        }
        if(prev==s.charAt(idx)){
            if(prev=='0'){
                return 1+find('1',s,idx+1);
            }
            else{
                return 1+find('0',s,idx+1);
            }

        }
        return find(s.charAt(idx),s,idx+1);
    }
    public int minOperations(String s) {
        int noChange=find('1',s,0);
        int change=find('0',s,0);
        return Math.min(change,noChange);
        
    }
}