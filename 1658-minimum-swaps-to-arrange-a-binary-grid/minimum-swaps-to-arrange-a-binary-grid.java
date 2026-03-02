class Solution {
    public int minSwaps(int[][] grid) {
        int arr[]=new int[grid.length];
        for(int i=0;i<arr.length;i++){
            int j=arr.length-1;
            int c=0;
            while(j>=0 && grid[i][j]==0){
                c++;
                j--;
            }
            arr[i]=c;
        }
        int steps=0;
        for(int i=0;i<arr.length;i++){
            int need=arr.length-i-1;
            if(arr[i]>=need){
                continue;
            }
            boolean found=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>=need){
                     steps=steps+(j-i);
                     found=true;
                     int k=j;
                     while(k>i){
                        int temp=arr[k];
                        arr[k]=arr[k-1];
                        arr[k-1]=temp;
                        k--;
                    }
                    break;
                }
            }
            if(i!=arr.length-1 && !found){
                return -1;
            }
        }
        return steps;
        
        
    }
}