class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        for(int i=0;i<arr1.length;i++){
            int ele=arr1[i];
            for(int j=0;j<arr2.length;j++){
                int diff=Math.abs(ele-arr2[j]);
                if(diff<=d){
                    break;
                }
                if(j==arr2.length-1){
                    ans++;
                }
            }
        }
        return ans;
        
    }
}