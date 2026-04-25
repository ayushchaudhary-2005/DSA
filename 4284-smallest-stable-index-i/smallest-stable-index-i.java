class Solution {
    public int firstStableIndex(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            int max=-1;
            for(int j=0;j<=i;j++){
                max=Math.max(max,arr[j]);
            }
            int min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                min=Math.min(arr[j],min);
            }
            if((max-min)<=k){
                return i;
            }

        }
        return -1;
        
    }
}