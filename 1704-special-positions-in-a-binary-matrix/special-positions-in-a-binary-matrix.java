class Solution {
    public int numSpecial(int[][] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    boolean rf=false;
                    boolean cf=false;
                    for(int a=0;a<arr[0].length;a++){
                        if(a!=j && arr[i][a]==1){
                            rf=true;
                            break;
                        }
                    }
                    for(int b=0;b<arr.length;b++){
                        if(b!=i && arr[b][j]==1){
                            cf=true;
                            break;
                        }
                    }
                    if(!rf && !cf){
                        ans++;
                    }
                }
            }
        }
        return ans;
        
    }
}