class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int s=0;
        int e=0;
        int ans=Integer.MAX_VALUE;
        int cs=0;
        while(e<arr.length){
            cs+=arr[e];
            if(cs>=target){
                 ans=Math.min(ans,e-s+1);
            }
            while(cs>target && s<e){
                if(cs>=target){
                    ans=Math.min(ans,e-s+1);
                }
                cs=cs-arr[s];
                s++;
                if(cs>=target){
                    ans=Math.min(ans,e-s+1);
                }
            }
            e++;

        }
        return ans==Integer.MAX_VALUE?0:ans;
        
    }
}