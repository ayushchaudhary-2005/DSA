class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        int idx=nums1.length;
        for(int i=0;i<nums2.length;i++){
            arr[idx++]=nums2[i];
        }
        if(arr.length==1){
            return (double)arr[0];
        }
        Arrays.sort(arr);
        if(arr.length%2!=0){
            return (double)arr[arr.length/2];
        }
        else{
            int fm=arr[(arr.length/2)-1];
            int sm=arr[arr.length/2];
            double ans=(fm+sm)/2.0;
            return ans;
        }

        
    }
}