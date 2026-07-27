class Solution {
    public int lengthOfLIS(int[] arr) {
        int ans[]=new int[arr.length];
        Arrays.fill(ans,1);
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    ans[i]=Math.max(ans[i],1+ans[j]);

                }
            }
            max=Math.max(max,ans[i]);
        }
        return max;
    
    }
}