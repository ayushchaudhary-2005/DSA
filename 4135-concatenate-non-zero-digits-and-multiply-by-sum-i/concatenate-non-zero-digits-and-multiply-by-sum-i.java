class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb=new StringBuilder();
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                sb.append(s.charAt(i));
            }
        }
        if(sb.isEmpty()){
            return 0;
        } 
        String ns=String.valueOf(sb);
        int sum=0;
        for(int i=0;i<ns.length();i++){
            int val=ns.charAt(i)-'0';
            sum=sum+val;
        }
        long ans=Long.parseLong(ns);

        return sum*ans;
    }
}