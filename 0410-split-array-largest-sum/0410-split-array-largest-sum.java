class Solution {
    public boolean find(int arr[],long mid,int k){
        int parts=1;
        long cs=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+cs<=mid){
                cs=cs+arr[i];
            }
            else{
                parts++;
                cs=arr[i];
            }
        }
        if(parts<=k){
            return true;
        }
        return false;
    }
    public int splitArray(int[] arr, int k){
        long sum=0;
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            sum=sum+i;
            max=Math.max(max,i);
        }
        long s=0;
        long e=sum;
        int ans=-1;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(mid>=max && find(arr,mid,k)){
                ans=(int)mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    
    }
}