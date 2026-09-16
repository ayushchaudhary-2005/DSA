class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int buyed=prices[0];
        for(int i=1;i<prices.length;i++){
            ans=Math.max(ans,prices[i]-buyed);
            buyed=Math.min(prices[i],buyed);
        }
        return ans;
        
    }
}