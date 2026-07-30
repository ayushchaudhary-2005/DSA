class Solution {
    public int find(List<Integer> al,int target, int cs,int idx,int dp[][]){
        if(idx==al.size() && cs==target){
            return 0;
        }
        if(idx==al.size() || target<cs){
            return Integer.MIN_VALUE;
        }
        if(dp[idx][cs]!=-1){
            return dp[idx][cs];
        }
        int take=1+find(al,target,cs+al.get(idx),idx+1,dp);
        int notTake=find(al,target,cs,idx+1,dp);
        return dp[idx][cs]=Math.max(take,notTake);
    }
    public int lengthOfLongestSubsequence(List<Integer> arr, int target) {
        int dp[][]=new int[1001][1001];
        for(int i=0;i<1001;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=find(arr,target,0,0,dp);
        if(ans<=0){
            return -1;
        }
        return ans;
        
    }
}