class Solution {
    public int numSubseq(int[] arr, int target) {
        Arrays.sort(arr);
        int s=0;
        int e=arr.length-1;
        long ans=0;
        long pow[]=new long[arr.length+1];
        pow[0]=1;
        for(int i=1;i<pow.length;i++){
            pow[i]=(2*pow[i-1])%1000000007;
        }
        while(e>=s){
            if((long)arr[s]+(long)arr[e]<=target){
                ans=(ans+(pow[e-s]))%1000000007;
                s++;
            }
            else{
                e--;

            }

        }
        return (int)ans;
        
    }
}