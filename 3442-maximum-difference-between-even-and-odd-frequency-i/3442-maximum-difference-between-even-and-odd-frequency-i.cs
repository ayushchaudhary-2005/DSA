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
        int maxOddFreq=int.MinValue;
        int minEvenFreq=int.MaxValue;
        foreach(char ch in hm.Keys){
            if(hm[ch]%2!=0 && hm[ch]>maxOddFreq){
                maxOddFreq=hm[ch];
            }
            if(hm[ch]%2==0 && hm[ch]<minEvenFreq){
                minEvenFreq=hm[ch];
            }
        }
        return maxOddFreq-minEvenFreq;
        
    }
}