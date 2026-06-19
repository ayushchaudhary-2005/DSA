class Solution {
    public int largestAltitude(int[] arr) {
        int ans=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            ans=Math.max(ans,sum);
        }
        return ans;
           
        
    }
}