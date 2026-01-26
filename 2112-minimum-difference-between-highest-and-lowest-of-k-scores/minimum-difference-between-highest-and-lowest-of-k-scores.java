class Solution {
    public int minimumDifference(int[] arr, int k) {
        if(k==1){
            return 0;
        }
        Arrays.sort(arr);
        int ans=arr[k-1]-arr[0];
        for(int i=1;i<=arr.length-k;i++){
            int min=arr[i];
            int max=arr[i+k-1];
            ans=Math.min(max-min,ans);
        }
        return ans;
        
    }
}