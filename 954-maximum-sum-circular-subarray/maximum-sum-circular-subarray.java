class Solution {
    public int find(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            ms=Math.max(ms,cs);
            if(cs<0){
                cs=0;
            }
        }
        return ms;
    }
    public int maxSubarraySumCircular(int[] arr) {
        int ans1=find(arr);
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=(-1)*arr[i];
        }
        int ms=find(arr);
        int ans2=sum-(-ms);
        if(sum+ms==0){
            return ans1;
        }
        return Math.max(ans1,ans2);

        
    }
}