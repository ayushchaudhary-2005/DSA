public class Solution {
    public bool CheckZeroOnes(string s) {
        int zs=0;
        int os=0;
        int currOs=0;
        int currZs=0;
        for(int i=0;i<s.Length;i++){
            if(s[i]=='0'){
                currOs=0;
                currZs++;
                zs=Math.Max(zs,currZs);
            }
            else{
                currZs=0;
                currOs++;
                os=Math.Max(os,currOs);
            }
        }
        if(os>zs){
            return true;
        }
        return false;
        
    }
}