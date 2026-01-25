class Solution {
    public boolean isValid(int arr[],int mo,int size){
        int op=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=size){
                continue;
            }
            else{
                op=op+((int)Math.ceil(arr[i]/(double)size))-1;
                if(op>mo){
                    return false;
                }
            }
        }
        return true;
    }
    public int minimumSize(int[] arr, int mo) {
        int s=1;
        int e=-1;
        for(int i:arr){
            e=Math.max(e,i);
        }
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(arr,mo,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;

        
    }
}