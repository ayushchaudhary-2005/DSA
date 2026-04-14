class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm1=new HashMap<>();
        HashMap<String,Character> hm2=new HashMap<>();
        String arr[]=s.split(" ");
        if(arr.length!=pattern.length()){
            return false;
        }
        int i=0;
        for(;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=arr[i];
            if(hm1.containsKey(ch) && !(hm1.get(ch).equals(word))){
                return false;
            }
            if(hm2.containsKey(word) && hm2.get(word)!=ch){
                return false;
            }
            hm1.put(ch,word);
            hm2.put(word,ch);
        }
        return true;
        
        
    }
}