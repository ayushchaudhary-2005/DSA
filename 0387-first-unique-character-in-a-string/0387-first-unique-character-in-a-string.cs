public class Solution {
    public int FirstUniqChar(string s) {
        Dictionary<char,int> hm =new Dictionary<char,int>();
        for(int i =0 ; i<s.Length;i++){
            char ch = s[i];
            if(!hm.ContainsKey(ch)){
                hm[ch]=1;
            }
            else{
                hm[ch]= hm[ch]+1;
            }
        }
        for(int i =0; i<s.Length;i++){
            char ch = s[i];
            if(hm[ch]==1){
                return i;
            }
        }
        return -1;
        
    }
}