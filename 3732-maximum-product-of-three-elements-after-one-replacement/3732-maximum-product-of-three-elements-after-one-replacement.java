class Solution {
    public long maxProduct(int[] arr) {
        Arrays.sort(arr);
        long f=(long)arr[0]*(long)arr[1];
        long s=(long)arr[0]*(long)arr[arr.length-1];
        long t=(long)arr[arr.length-1]*(long)arr[arr.length-2];
        long ans1=f*(-100000);
        long ans2=f*(100000);
        long ans3=s*(-100000);
        long ans4=s*(100000);
        long ans5=t*(-100000);
        long ans6=t*(100000);
        return Math.max(ans1,Math.max(ans2,Math.max(ans3,Math.max(ans4,Math.max(ans5,ans6)))));
        
    }
}