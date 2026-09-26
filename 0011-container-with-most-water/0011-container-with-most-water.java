class Solution {
    public int maxArea(int[] arr) {
        int ans=0;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int lH=arr[i];
            int rH=arr[j];
            ans=Math.max((j-i)*Math.min(lH,rH),ans);
            if(lH>=rH){
                j--;

            }
            else{
                i++;
            }
        }
        return ans;
    }
}