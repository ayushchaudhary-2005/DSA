public class Solution {
    public int MaxDifference(string s) {
        Dictionary<char,int> hm=new Dictionary<char,int>();
        for(int i=0;i<s.Length;i++){
            char ch=s[i];
            if(!hm.ContainsKey(ch)){
                hm[ch]=1;
            }
            else{
               hm[ch]=hm[ch]+1;
            }
        }
        int maxOdd=int.MinValue;
        int minEven=int.MaxValue;
        foreach(char ch in hm.Keys){
            if(hm[ch]%2==0){
                if(minEven>hm[ch]){
                    minEven=hm[ch];
                }

            }
            else{
                if(maxOdd<hm[ch]){
                    maxOdd=hm[ch];
                }
            }
        }
        return maxOdd-minEven;
        
    }
}