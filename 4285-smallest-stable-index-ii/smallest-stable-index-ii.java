class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int max[]=new int[arr.length];
        int min[]=new int[arr.length];
        max[0]=arr[0];
        int max1=arr[0];
        for(int i=1;i<arr.length;i++){
            max1=Math.max(max1,arr[i]);
            max[i]=max1;
        }
        min[arr.length-1]=arr[arr.length-1];
        int min1=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            min1=Math.min(min1,arr[i]);
            min[i]=min1;
        }
        for(int i=0;i<arr.length;i++){
            int maxi=max[i];
            int mini=min[i];
            if((maxi-mini)<=k){
                return i;
            }
        }
        return -1;
        
    }
}