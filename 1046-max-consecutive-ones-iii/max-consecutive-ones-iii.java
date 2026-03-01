class Solution {
    public int longestOnes(int[] arr, int k) {
        int ans=0;
        int oc=0;
        int zc=0;
        int s=0;
        int e=0;
        while(e<arr.length){
            if(arr[e]==1){
                oc++;
            }
            while(((e-s+1)-oc)>k){
                if(arr[s]==1){
                    oc--;
                }
                s++;

            }
            ans=Math.max(ans,e-s+1);
            e++;
        }
        return ans;
        
    }
}