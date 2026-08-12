class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int maxLen=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        while(end<nums.length){
            hm.put(nums[end],hm.getOrDefault(nums[end],0)+1);
            if(hm.get(nums[end])>k){
                while(hm.get(nums[end])!=k){
                    hm.put(nums[start],hm.get(nums[start])-1);
                    start++;
                }
            }
            maxLen=Math.max(maxLen,end-start+1);
            end++;
        }
        return maxLen;
        
    }
}