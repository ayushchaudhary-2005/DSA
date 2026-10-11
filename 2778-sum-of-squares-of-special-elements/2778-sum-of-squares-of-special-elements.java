class Solution {
    public int sumOfSquares(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr.length%(i+1)==0){
                ans=ans+arr[i]*arr[i];
            }
        }
        return ans;
        
    }
}