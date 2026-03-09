class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int s=0;
        int e=0;
        int cs=0;
        int ans=Integer.MAX_VALUE;
        while(e<arr.length){
            cs+=arr[e]; 


            while(s<arr.length && cs>=target){
                if(cs>=target){
                ans=Math.min(ans,e-s+1);
            }
                cs=cs-arr[s];
                s++;
            }

            e++;

        }
        return ans==Integer.MAX_VALUE?0:ans;
        
    }
}