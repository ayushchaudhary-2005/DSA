class Solution {
    public int minFallingPathSum(int[][] arr) {
       for(int i=arr.length-2;i>=0;i--){
        for(int j=0;j<arr[0].length;j++){
            int dl=Integer.MAX_VALUE;
            int b=Integer.MAX_VALUE;
            int dr=Integer.MAX_VALUE;
            if(j-1>=0){
                dl=arr[i][j]+arr[i+1][j-1];
            }
            b=arr[i][j]+arr[i+1][j];
            if(j+1<arr.length){
                dr=arr[i][j]+arr[i+1][j+1];
            }
            arr[i][j]=Math.min(b,Math.min(dl,dr));
       }}
       int ans=Integer.MAX_VALUE;
       for(int i=0;i<arr[0].length;i++){
        ans=Math.min(ans,arr[0][i]);
       }
       return ans;
        
    }
}