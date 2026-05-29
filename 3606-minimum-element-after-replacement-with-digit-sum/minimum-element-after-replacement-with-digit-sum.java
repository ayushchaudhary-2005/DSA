class Solution {
    public int find(int num){
        int sum=0;
        while(num>0){
            int lastDigit=num%10;
            sum=sum+lastDigit;
            num=num/10;
        }
        return sum;
    }
    public int minElement(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int sum=find(arr[i]);
            arr[i]=sum;
        }
        int ans=Integer.MAX_VALUE;
        for(int i:arr){
            ans=Math.min(ans,i);
        }
        return ans;
        
    }
}