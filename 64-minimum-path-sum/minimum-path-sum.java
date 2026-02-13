class Solution {
    public int minPathSum(int[][] arr) {
        for(int i=arr[0].length-2;i>=0;i--){
            arr[arr.length-1][i]=arr[arr.length-1][i]+arr[arr.length-1][i+1];
        }
        for(int i=arr.length-2;i>=0;i--){
            arr[i][arr[0].length-1]=arr[i][arr[0].length-1]+arr[i+1][arr[0].length-1];

        }
        for(int i=arr.length-2;i>=0;i--){
            for(int j=arr[0].length-2;j>=0;j--){
                arr[i][j]=arr[i][j]+Math.min(arr[i+1][j],arr[i][j+1]);
            }
        }
        return arr[0][0];
        
    }
}