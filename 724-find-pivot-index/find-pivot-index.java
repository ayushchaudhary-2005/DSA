class Solution {
    public int pivotIndex(int[] arr) {
        int larr[]=new int[arr.length];
        int rarr[]=new int[arr.length];
        int lsum=0;
        for(int i=1;i<arr.length;i++){
            lsum=lsum+arr[i-1];
            larr[i]=lsum;
        } 
        int rsum=0;
        for(int i=arr.length-2;i>=0;i--){
            rsum=rsum+arr[i+1];
            rarr[i]=rsum;
            
        }
        for(int i=0;i<arr.length;i++){
            if(larr[i]==rarr[i]){
                return i;
            }
        }
        return -1;
        
    }
}