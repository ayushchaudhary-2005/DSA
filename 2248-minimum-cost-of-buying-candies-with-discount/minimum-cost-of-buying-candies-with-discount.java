class Solution {
    public int minimumCost(int[] arr) {
        if(arr.length==2){
            return arr[0]+arr[1];
        }
        if(arr.length==1){
            return arr[0];
        }
        Arrays.sort(arr);
        int e=arr.length-1;
        int cost=0;
        while(e>=0){
            if(e==0){
                 cost=cost+arr[e];

            }
            else{
                cost=cost+arr[e]+arr[e-1];

            }
            e-=3;
            
        }
        return cost;

        
    }
}