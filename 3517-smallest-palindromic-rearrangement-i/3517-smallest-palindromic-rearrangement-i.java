class Solution {
    public String smallestPalindrome(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']+=1;
        }
        StringBuilder start=new StringBuilder();
        StringBuilder end=new StringBuilder();
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                  int val=freq[i]/2;
                  for(int j=0;j<val;j++){
                    start.append((char)(97+i));
                    end.append((char)(97+i));
                }
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0){
                start.append((char)(97+i));

            }
        }
        String s1=start.toString();
        String s2=end.reverse().toString();
        return s1+s2;
        
    }
}