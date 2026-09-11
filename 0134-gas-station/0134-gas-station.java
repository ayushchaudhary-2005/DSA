class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int k=gas.length;
        long tt=0;
        long cc=0;
        for(int i=0;i<gas.length;i++){
            tt+=gas[i];
            cc+=cost[i];
        }
        if(tt<cc){
            return -1;
        }
        int total=0;
        int ans=0;
        for(int i=0;i<gas.length;i++){
           total+=gas[i]-cost[i];
           if(total<0){
            ans=i+1;
            total=0;
            }

        }
        return ans;
        
    }
}