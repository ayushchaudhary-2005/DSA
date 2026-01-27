class Solution {
    public int sumSubseqWidths(int[] arr) {
        Arrays.sort(arr);
        long ans=0;
        long pow[]=new long[arr.length];
        pow[0]=1;
        for(int i=1;i<arr.length;i++){
            pow[i]=(pow[i-1]*2)%1000000007;
        }
        for(int i=0;i<arr.length;i++){
            long max=(pow[i]*arr[i])%1000000007;
            long min=(pow[arr.length-1-i]*arr[i])%1000000007;
            ans=(ans+(max-min+1000000007))%1000000007;

        }
        return (int)ans;

        
    }
}