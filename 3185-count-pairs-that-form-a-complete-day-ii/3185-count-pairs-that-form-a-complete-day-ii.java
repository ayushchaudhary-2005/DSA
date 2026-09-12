class Solution {
    public long countCompleteDayPairs(int[] hours) {
        int freq[]=new int[24];
        for(int i:hours){
            freq[i%24]++;
        }
        long ans=(long)freq[0]*(freq[0]-1)/2;
        for(int i=1;i<=(24-1)/2;i++){
            ans=ans+freq[i]*(freq[24-i]);
        }
        ans=ans+(long)freq[12]*(freq[12]-1)/2;
        return ans;
        
    }
}