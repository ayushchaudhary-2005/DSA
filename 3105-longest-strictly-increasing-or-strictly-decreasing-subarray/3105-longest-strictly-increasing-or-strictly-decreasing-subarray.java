class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        int incSize=1;
        int ans=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                incSize++;
                ans=Math.max(ans,incSize);
            }
            else{
                incSize=1;
            }

        }
        int decSize=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                decSize++;
                ans=Math.max(ans,decSize);
            }
            else{
                decSize=1;
            }

        }
        return ans;
        
    }
}