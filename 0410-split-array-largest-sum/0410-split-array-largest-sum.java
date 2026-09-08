class Solution {
    public boolean isValid(int arr[],long val,int k){
        int parts=1;
        long cs=0;
        for(int i=0;i<arr.length;i++){
            if(cs+arr[i]<=val){
                cs+=arr[i];
            }
            else{
                cs=arr[i];
                parts++;
            }
            if(parts>k){
                return false;
            }

        }
        return true;

    
    
    }


    public int splitArray(int[] arr, int k) {
        long sum=0;
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
            sum+=i;
        }
        long s=0;
        long e=sum;
        long ans=Long.MAX_VALUE;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(mid>=max && isValid(arr,mid,k)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return (int)ans;

        
    }
}