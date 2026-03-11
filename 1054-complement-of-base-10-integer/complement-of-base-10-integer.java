class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                sb.append(1);
            }
            else{
                sb.append(0);
            }
        }
        String ns=sb.toString();
        return Integer.parseInt(ns,2);
        
    }
}