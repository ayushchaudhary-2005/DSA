class Solution {
    public int countMajoritySubarrays(int[] arr, int target) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int freq=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==target){
                        freq++;
                }
                if(freq>(j-i+1)/2){
                        ans++;
                }
            }
        }
        return ans;
        
    }
}