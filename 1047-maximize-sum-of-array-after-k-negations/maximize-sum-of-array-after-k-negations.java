class Solution {
    public int largestSumAfterKNegations(int[] arr, int k) {
        Arrays.sort(arr);
        int idx=0;
        while(idx<arr.length && arr[idx]<0 && k>0){
            arr[idx]=-arr[idx];
            idx++;
            k--;
        }
        if(k==0){
            int ans=0;
            for(int i:arr){
               ans+=i;
            }
            return ans;
        }
        Arrays.sort(arr);
        if(k>0){
            if(k%2==0){
                int ans=0;
                for(int i:arr){
                ans+=i;
                }
               return ans;
            }
            else{  
                arr[0]=-arr[0];
                int ans=0;
                for(int i:arr){
                ans+=i;
                }
               return ans;
        }}
        return -1;



        
    }
}