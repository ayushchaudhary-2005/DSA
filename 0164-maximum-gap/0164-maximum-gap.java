class Solution {
    public int maximumGap(int[] arr) {
        Arrays.sort(arr);
        int ans=0;
        for(int i=1;i<arr.length;i++){
            ans=Math.max(ans,arr[i]-arr[i-1]);
        }
        return ans;
    }
}