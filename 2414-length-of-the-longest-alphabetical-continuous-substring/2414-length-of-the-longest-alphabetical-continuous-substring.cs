public class Solution {
    public int LongestContinuousSubstring(string s) {
        int ans=0;
        int currAns=1;
        char prev=s[0];
        for(int i=1;i<s.Length;i++){
            char curr=s[i];
            if(curr-prev==1){
                currAns++;
                prev=curr;
            }
            else{
                prev=curr;
                currAns=1;
            }
            ans=Math.Max(ans,currAns);
        }
        return ans==0?1:ans;
        
    }
}