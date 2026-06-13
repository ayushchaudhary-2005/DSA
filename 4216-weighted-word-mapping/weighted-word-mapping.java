class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        char arr[]=new char[26];
        int j=0;
        for(int i=25;i>=0;i--){
            char ch=(char)(97+j);

            arr[i]=ch;
            j++;

        }
        for(int i=0;i<words.length;i++){
            String currWord=words[i];
            int sum=0;
            for(j=0;j<currWord.length();j++){
                char ch=currWord.charAt(j);
                sum=sum+weights[ch-'a'];
            }
            int val=sum%26;
            sb.append(arr[val]);
        }
        return sb.toString();
        
    }
}