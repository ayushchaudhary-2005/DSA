class Solution {
    public int minDifference(int[] arr) {
        if(arr.length<=3){
            return 0;
        }
        Arrays.sort(arr);
        int ans1=arr[arr.length-4]-arr[0];
        int ans2=arr[arr.length-1]-arr[3];
        int ans3=arr[arr.length-2]-arr[2];
        int ans4=arr[arr.length-3]-arr[1];
        return Math.min(ans1,Math.min(ans2,Math.min(ans3,ans4)));

        
        
    }
}