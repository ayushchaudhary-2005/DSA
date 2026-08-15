public class Solution {
    public int FindMaxConsecutiveOnes(int[] arr) {
        int ans=0;
        int currAns=0;
       for(int i=0;i<arr.Length;i++){
        if(arr[i]==1){
            currAns++;
            ans=Math.Max(ans,currAns);
        }
        else{
            currAns=0;
        }
       }
       return ans;

        
    }
}