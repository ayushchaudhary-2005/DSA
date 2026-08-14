class Solution {
    public int maximumLengthSubstring(String s) {
        int narr[]=new int[26];
        for(int i=0;i<s.length();i++){
            narr[s.charAt(i)-'a']++;
        } 
        int uniques=0;
        for(int i:narr){
            if(i!=0){
                uniques++;
            }
        }
        int arr[]=new int[26];
        int st=0;
        int e=0;
        int c=0;
        int ans=0;
        while(e<s.length()){
            char ch=s.charAt(e);
            if(arr[ch-'a']==0){
                c++;
                arr[ch-'a']++;
            }
            else{
                arr[ch-'a']++;
            }
            while(st<e && arr[ch-'a']>2){
                arr[s.charAt(st)-'a']--;
                if(arr[s.charAt(st)-'a']==0){
                    c--;
                }
                st++;
            }
                ans=Math.max(ans,e-st+1);
            e++;

        }
        return ans;

        
    }
}