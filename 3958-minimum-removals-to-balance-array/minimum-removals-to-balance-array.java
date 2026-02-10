class Solution {
    public int minRemoval(int[] arr, int k) {
        Arrays.sort(arr);
        int j=1;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            while(j<arr.length && (long)arr[j]<=(long)k*arr[i]){
                j++;
            }
            ans=Math.max(ans,j-i);

        }
        return arr.length-ans;
    
    }
}