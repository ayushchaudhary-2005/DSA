class Solution {
    long ans=Integer.MAX_VALUE;
    public void find(int arr[],long count[],int idx){
        if(idx==arr.length){
            long max=0;
            for(long i:count){
                max=Math.max(i,max);
            }
            ans=Math.min(ans,max);
            return;
        }
        for(int j=0;j<count.length;j++){
            count[j]+=arr[idx];
            find(arr,count,idx+1);
            count[j]-=arr[idx];
            if(count[j]==0){
                break;
            }
        }

    }
    public int minimumTimeRequired(int[] arr, int k) {
        long count[]=new long[k];
        find(arr,count,0);
        return (int)ans;
        
    }
}