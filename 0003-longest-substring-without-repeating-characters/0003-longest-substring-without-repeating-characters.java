class Solution {
    public int lengthOfLongestSubstring(String str) {
        HashSet<Character> hs=new HashSet<>();
        int s=0;
        int e=0;
        int ans=0;
        while(e<str.length()){
            char ch=str.charAt(e);
            while(hs.contains(ch) && s<e && e<str.length()){
                hs.remove(str.charAt(s));
                s++;
                
            }
            hs.add(ch);
            ans=Math.max(ans,e-s+1);
            e++;
        }
        return ans;
        
    }
}