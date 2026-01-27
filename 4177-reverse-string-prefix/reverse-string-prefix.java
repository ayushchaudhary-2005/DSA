class Solution {
    public String find(String s,int st,int e){
        StringBuilder sb=new StringBuilder();
        while(e>=0){
            sb.append(s.charAt(e));
            e--;
        }
        return sb.toString();

    }
    public String reversePrefix(String s, int k) {
        if(k==1){
            return s;
        }
        
        String ns=find(s,0,k-1);
        StringBuilder sb=new StringBuilder(ns);
        for(int i=k;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
        
    }
}