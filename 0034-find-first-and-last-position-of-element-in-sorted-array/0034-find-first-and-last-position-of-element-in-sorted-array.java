class Solution {
    public int findInLeft(int arr[],int e,int target){
        int s=0;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans=mid;
                e=mid-1;
                
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;

    }
    public int findInRight(int arr[],int s,int target){
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans=mid;
                s=mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;

    }

    public int[] searchRange(int[] arr, int target) {
        int ans[]=new int[2];
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                int findLeft=findInLeft(arr,mid,target);
                int findRight=findInRight(arr,mid,target);
                ans[0]=findLeft;
                ans[1]=findRight;
                return ans;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;
        
    }
}