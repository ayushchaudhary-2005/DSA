class Solution {
    public int maxSubArray(int[] arr) {
         int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            ms=Math.max(ms,cs);
            if(cs<0){
                cs=0;
            }
        }
        return ms;
        
    }
}