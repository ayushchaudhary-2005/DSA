class Solution {
    public boolean mergeTriplets(int[][] arr, int[] target) {
        boolean find1=false;
        boolean find2=false;
        boolean find3=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]<=target[0] && arr[i][1]<=target[1] && arr[i][2]<=target[2]){
            for(int j=0;j<3;j++){
                if(arr[i][0]==target[0]){
                    find1=true;
                }
                if(arr[i][1]==target[1]){
                    find2=true;
                }
                if(arr[i][2]==target[2]){
                    find3=true;
                }
            }}
        }
        return (find1 && find2 && find3);
        
    }
}