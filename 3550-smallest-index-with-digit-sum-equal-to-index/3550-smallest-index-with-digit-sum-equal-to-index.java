class Solution {
    public int find(int num){
        int s=0;
        while(num>0){
            s=s+num%10;
            num=num/10;
        }
        return s;
    }
    public int smallestIndex(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int sum=find(arr[i]);
            if(sum==i){
                return i;
            }
        }
        return -1;
        
    }
}