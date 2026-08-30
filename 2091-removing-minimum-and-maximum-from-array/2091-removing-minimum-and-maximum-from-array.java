class Solution {
    public int minimumDeletions(int[] arr) {
        int minIdx=0;
        int minVal=Integer.MAX_VALUE;
        int maxVal=Integer.MIN_VALUE;
        int maxIdx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
                maxIdx=i;
            }
            if(arr[i]<minVal){
                minVal=arr[i];
                minIdx=i;
            }
        }
        int left=Math.max(minIdx,maxIdx)+1;
        int right=arr.length-Math.min(minIdx,maxIdx);
        int val3=Math.min(minIdx+1,arr.length-minIdx)+Math.min(maxIdx+1,arr.length-maxIdx);
        return Math.min(left,Math.min(right,val3));
        
        
    }
}