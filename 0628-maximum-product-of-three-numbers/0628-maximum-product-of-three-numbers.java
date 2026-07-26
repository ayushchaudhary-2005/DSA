class Solution {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        return Math.max(arr[0]*arr[1]*arr[arr.length-1],arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3]);
        
    }
}