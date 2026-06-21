class Solution {
    public int maxIceCream(int[] arr, int coins) {
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>coins){
                return ans;
            }
            else{
                ans++;
                coins=coins-arr[i];
            }
        }
        return ans;
        
    }
}