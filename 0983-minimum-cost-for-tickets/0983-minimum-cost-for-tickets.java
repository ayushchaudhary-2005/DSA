class Solution {
    public long find(int days[],int costs[],int prev,int idx,long dp[][]){
        if(idx==days.length || prev>days[days.length-1]){
            return 0;
        }
        while(idx<days.length && days[idx]<prev){
            idx++;
        }
         if(idx<days.length && prev!=-1 && dp[idx][prev]!=-1){
            return dp[idx][prev];
        }
        long take1=Integer.MAX_VALUE;
        if(days[idx]>=prev){
            take1=costs[0]+find(days,costs,days[idx]+1,idx+1,dp);
        }
        long take7=Integer.MAX_VALUE;
        if(days[idx]>=prev){
            take7=costs[1]+find(days,costs,days[idx]+7,idx+1,dp);
        }
        long take30=Integer.MAX_VALUE;
        if(days[idx]>=prev){
            take30=costs[2]+find(days,costs,days[idx]+30,idx+1,dp);
        }
        if(prev!=-1){
            dp[idx][prev]=Math.min(take1,Math.min(take7,take30));
        }
        return Math.min(take1,Math.min(take7,take30));
    }
    public int mincostTickets(int[] days, int[] costs) {
        long dp[][]=new long[days.length][366];
        for(int i=0;i<days.length;i++){
            Arrays.fill(dp[i],-1);
        }
        long ans=find(days,costs,-1,0,dp);
        if(ans>=Integer.MAX_VALUE){
            return -1;
        }
        return (int)ans;
        
    }
}