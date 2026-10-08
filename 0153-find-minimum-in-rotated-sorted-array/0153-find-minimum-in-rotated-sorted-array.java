class Solution {
    public int findMin(int[] arr) {
        int s=0;
        int e=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>=arr[s]){
                if(ans>arr[s]){
                    ans=arr[s];
                }
                s=mid+1;
            }
        else{
            if(arr[mid]<ans){
                ans=arr[mid];
            }
            e=mid-1;

        }
    } 
    return ans;  
    }
}