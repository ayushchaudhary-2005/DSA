class Solution {
    public boolean find(int arr[][],int colors[],int node,int color){
        colors[node]=color;
        for(int i=0;i<arr[node].length;i++){
            int neighbor=arr[node][i];
            if(colors[neighbor]==color){
                return false;
            }
            if(colors[neighbor]==-1){
                if(find(arr,colors,neighbor,1-color)==false){
                    return false;
                }
            }

        }
        return true;
    }
    public boolean isBipartite(int[][] arr) {
        int colors[]=new int[arr.length];
        Arrays.fill(colors,-1);
        for(int i=0;i<arr.length;i++){
            if(colors[i]==-1){
                if(find(arr,colors,i,0)==false){
                    return false;
                }
            }

        }
        return true;
       
        
        
    }
}