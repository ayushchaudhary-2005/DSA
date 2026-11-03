class Solution {
    public int minMoves(int[] arr) {
       int last=1;
       for(int i=0;i<arr.length;i++){
        last=Math.max(last,arr[i]);
       }
       int ans=0;
       for(int i:arr){
        ans=ans+(last-i);
       }
       return ans;
        
    }
}