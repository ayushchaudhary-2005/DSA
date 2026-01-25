class Solution {
    public int find(String s,int idx,int c,char prev){
        if(idx==s.length()){
            return 0;
        }
        if(s.charAt(idx)==prev){
            if(prev=='1'){
                return 1+find(s,idx+1,c+1,'0');
            }
            else{
                return 1+find(s,idx+1,c+1,'1');

            }

        }
        return find(s,idx+1,c,s.charAt(idx));
    }
    public int minOperations(String s) {
        int ans1=find(s,0,0,'1');
        int ans2=find(s,0,0,'0');
        return Math.min(ans1,ans2);
        
    }
}