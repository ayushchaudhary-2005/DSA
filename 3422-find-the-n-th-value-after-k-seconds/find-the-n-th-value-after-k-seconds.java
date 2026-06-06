class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int i=0;
        int arr[]=new int[n];
        Arrays.fill(arr,1);
        while(i<k){
            for(int j=1;j<n;j++){
                arr[j]=(arr[j]+arr[j-1])%1000000007;
            }
            i++;
        }
        return arr[arr.length-1];
        
    }
}