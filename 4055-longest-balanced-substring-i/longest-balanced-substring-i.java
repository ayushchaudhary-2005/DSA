class Solution {
    public int longestBalanced(String s) {
        int ans=0;
        if(s.length()==1){
            return 1;
        }
        for(int i=0;i<s.length();i++){
            int arr[]=new int[26];
            arr[s.charAt(i)-'a']+=1;
            int currAns=1;
            for(int j=i+1;j<s.length();j++){
                char ch=s.charAt(j);
                arr[ch-'a']+=1;
                int count=arr[ch-'a'];
                int k=i;
                while(k<=j){
                    if(arr[s.charAt(k)-'a']==count){
                        k++;
                    }
                    else{
                        break;
                    }
                }
                if(k>j){
                    ans=Math.max(ans,j-i+1);
                }

            }
        }
        return ans;
        
    }
}