class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()>t.length() || t.length()>s.length()){
            return false;
        }
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm1.put(s.charAt(i),hm1.getOrDefault(s.charAt(i),0)+1);
            hm2.put(t.charAt(i),hm2.getOrDefault(t.charAt(i),0)+1);
        }
        Set<Character> ks=hm1.keySet();
        for(char ch:ks){
            if(!hm2.containsKey(ch) || !(hm1.get(ch).equals(hm2.get(ch)))){
                return false;
            }
        }
        return true;
        
    }
}