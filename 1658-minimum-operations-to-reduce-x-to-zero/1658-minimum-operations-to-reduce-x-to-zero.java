class Solution {
    public int minOperations(int[] arr, int x){
        int n=arr.length;
        int l=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int r=0;r<2*n;r++){
            sum+=arr[r%n];
            while(l<=r && (sum>x || r-l+1>n)){
                sum-=arr[l%n];
                l++;
            }
             if(sum==x){
                int len=r-l+1;
                boolean valid=(l==0 && r<n) || (r==n-1) || (l<n && r>=n);
                if(valid){
                    ans=Math.min(ans,len);
                }
            }
        }

        return ans==Integer.MAX_VALUE?-1:ans;
        
    }
}