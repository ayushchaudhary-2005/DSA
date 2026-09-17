class Solution {
    public boolean findSubarrays(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            long cs=arr[i]+arr[i+1];
            int s=i+1;
            long currSum=0;
            for(int e=i+1;e<arr.length;e++){
                currSum+=arr[e];
                if(e-s+1==2){
                    if(cs==currSum){
                        return true;
                    }
                    currSum=currSum-arr[s];
                    s++;
                }

            }
        }
        return false;
    }
}