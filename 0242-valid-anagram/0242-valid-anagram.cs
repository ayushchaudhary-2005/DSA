public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length!=t.Length){
            return false;
        }
       int[] arr1=new int[26]; 
       int[] arr2=new int[26];
       for(int i=0;i<s.Length;i++){
        arr1[s[i]-'a']+=1;
        arr2[t[i]-'a']+=1;
       }
       for(int i=0;i<26;i++){
        if(arr1[i]!=arr2[i]){
            return false;
        }
       }
       return true;
        
    }
}