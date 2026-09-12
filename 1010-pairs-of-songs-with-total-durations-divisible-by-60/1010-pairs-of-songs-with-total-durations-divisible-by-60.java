class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int freq[]=new int[60];
        for(int i:time){
            freq[i%60]++;
        }
        long ans=(long)freq[0]*(freq[0]-1)/2;
        for(int i=1;i<=(60-1)/2;i++){
            ans=ans+(freq[i]*freq[60-i]);

        }
        ans=ans+(long)freq[30]*(freq[30]-1)/2;
        return (int)ans;
        
    }
}