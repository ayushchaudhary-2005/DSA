class Solution {
    public int[] leftRightDifference(int[] arr) {
        int ans[]=new int[arr.length];
        int left[]=new int[arr.length];
        left[0]=0;
        int sum=0;
        for(int i=1;i<arr.length;i++){
            sum=sum+arr[i-1];
            left[i]=sum;
        }
        sum=0;
        int right[]=new int[arr.length];
        right[arr.length-1]=0;
        for(int i=arr.length-2;i>=0;i--){
            sum=sum+arr[i+1];
            right[i]=sum;
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=Math.abs(left[i]-right[i]);
        }
        return ans;
        
    }
}