class Solution {
    public int countHomogenous(String s) {
        int arr[][]=new int[26][s.length()+1];
        int c=1;
        char currCh=s.charAt(0);
        arr[s.charAt(0)-'a'][1]=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==currCh){
                c++;
                arr[ch-'a'][c]=arr[ch-'a'][c]+1;
            }
            else{
                c=1;
                arr[ch-'a'][c]=arr[ch-'a'][c]+1;
                currCh=ch;
            }
        }
        for(int i=0;i<26;i++){
            for(int j=s.length()-1;j>=1;j--){
                arr[i][j]=arr[i][j]+arr[i][j+1];
            }
        }
        long ans=0;
        for(int i=0;i<26;i++){
            for(int j=s.length();j>=1;j--){
                ans=ans+arr[i][j];
            }
        }
        return (int)(ans%1000000007);

        
    }
}