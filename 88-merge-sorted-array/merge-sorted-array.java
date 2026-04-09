class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx=m+n-1;
        int fidx=m-1;
        int sidx=n-1;
        while(fidx>=0 && sidx>=0){
            if(nums1[fidx]>=nums2[sidx]){
                nums1[idx--]=nums1[fidx];
                fidx--;
            }
            else{
                nums1[idx--]=nums2[sidx];
                sidx--;
            }
        }
        while(fidx>=0){
             nums1[idx--]=nums1[fidx];
            fidx--;
        }
        while(sidx>=0){
             nums1[idx--]=nums2[sidx];
            sidx--;
        }
        
    }
}