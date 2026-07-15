class Solution {
    public int minMoves(int[] arr) {
        Arrays.sort(arr);
        int last=arr[arr.length-1];
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans+Math.abs(last-arr[i]);
        }
        return ans;
        
    }
}