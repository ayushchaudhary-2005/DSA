class Solution {
    public int numberOfSpecialChars(String word) {
        boolean visited[]=new boolean[26];
        int small[][]=new int[26][2];
        int large[][]=new int[26][2];
        for(int i=0;i<26;i++){
            Arrays.fill(small[i],-1);
        }
        for(int i=0;i<26;i++){
            Arrays.fill(large[i],-1);
        }
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z' && large[ch-'A'][0]==-1){
                large[ch-'A'][0]=1;
                large[ch-'A'][1]=i;
            }
            if(ch>='a' && ch<='z'){
                small[ch-'a'][0]=1;
                small[ch-'a'][1]=i;

            }

        } 
        int ans=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z' && !visited[ch-'a'] && large[(ch-32)-'A'][0]==1 && small[ch-'a'][1]<large[(ch-32)-'A'][1]){
                visited[ch-'a']=true;
                ans++;
            }

        }
        return ans;
        
    }
}