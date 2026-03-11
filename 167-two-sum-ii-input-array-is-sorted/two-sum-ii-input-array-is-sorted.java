class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i=0;
        int j=arr.length-1;
        int ans[]=new int[2];
        while(i<j){
            int cs=arr[i]+arr[j];
            if(cs==target){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(cs>target){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
        
    }
}