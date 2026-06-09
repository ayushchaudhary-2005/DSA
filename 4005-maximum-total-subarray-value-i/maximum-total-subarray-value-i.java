class Solution {
    public long maxTotalValue(int[] arr, int k) {
        Arrays.sort(arr);
        long min=arr[0];
        long max=arr[arr.length-1];
        return k*(max-min);
        
    }
}