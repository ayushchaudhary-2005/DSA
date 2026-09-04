class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int minArr[]=new int[arr.length];
        minArr[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            minArr[i]=Math.min(arr[i],minArr[i+1]);
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            int score=max-minArr[i];
            if(score<=k){
                return i;
            }

        }
        return -1;
        
    }
}