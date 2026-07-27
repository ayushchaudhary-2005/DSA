class Solution {
    public int maxWidthRamp(int[] arr) {
       int maxArr[]=new int[arr.length];
       int max=arr[arr.length-1];
       for(int i=arr.length-1;i>=0;i--){
        maxArr[i]=max=Math.max(max,arr[i]);
       }
       int j=0;
       int ans=0;
       int i=0;
       while(i<arr.length && j<arr.length){
        if(arr[i]>maxArr[j]){
            i++;
        }
        else{
            while(j<arr.length && arr[i]<=maxArr[j]){
                ans=Math.max(ans,j-i);
                j++;
            }
            i++;
        }
       }
       return ans;
        
    }
}