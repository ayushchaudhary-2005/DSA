class Solution {
    public int numberOfSpecialChars(String word) {
        boolean visited[]=new boolean[26];
        int small[]=new int[26];
         int large[]=new int[26];
        Arrays.fill(small,-1);
        Arrays.fill(large,-1);
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z'){
                large[ch-'A']=1;
            }
            if(ch>='a' && ch<='z'){
                small[ch-'a']=1;
            }

        } 
        int ans=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z' && !visited[ch-'a'] && large[(ch-32)-'A']==1){
                visited[ch-'a']=true;
                ans++;
            }

        }
        return ans;
        
    }
}