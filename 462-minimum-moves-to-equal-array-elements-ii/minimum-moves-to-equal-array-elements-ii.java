class Solution {
    public int minMoves2(int[] arr) {
        Arrays.sort(arr);
        int median=0;
        if(arr.length%2==0){
            if(arr.length>2){
                median=(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
            }
            else{
                median=(arr[0]+arr[1])/2;
            }
        }
        else{
            median=arr[arr.length/2];
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans+Math.abs(arr[i]-median);
        }
        return ans;
        
    }
}