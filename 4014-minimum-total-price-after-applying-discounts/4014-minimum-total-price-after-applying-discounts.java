class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=prices.length-1;
        int j=discounts.length-1;
        double ans=0;
        while(i>=0 && j>=0){
            ans=ans+((double)prices[i]*(100-discounts[j])/100.0);
            i--;j--;
        }
        for(int k=0;k<=i;k++){
            ans=ans+prices[k];
        }
        return ans;
        
    }
}