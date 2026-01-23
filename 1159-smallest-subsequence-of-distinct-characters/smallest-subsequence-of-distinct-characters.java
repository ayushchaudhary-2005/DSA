class Solution {
    public String smallestSubsequence(String s) {
        int lastTime[]=new int[26];
        for(int i=0;i<s.length();i++){
            lastTime[s.charAt(i)-'a']=i;
        }
        boolean visited[]=new boolean[26];
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(visited[ch-'a']){
                continue;
            }
            while(!st.isEmpty() && st.peek()>ch && lastTime[st.peek()-'a']>i){
                char currCh=st.pop();
                visited[currCh-'a']=false;
            }
            visited[ch-'a']=true;
            st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
        
    }
}