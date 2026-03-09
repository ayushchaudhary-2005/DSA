class Solution {
    public int pivotIndex(int[] arr) {
        int leftSum[]=new int[arr.length];
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            leftSum[i]=cs;
        }
        for(int i=0;i<arr.length;i++){
            int lsum=0;
            if(i!=0){
                 lsum=leftSum[i-1];

            }
            int rsum=leftSum[arr.length-1]-leftSum[i];
            if(lsum==rsum){
                return i;
            }
        }
        return -1;

        
    }
}