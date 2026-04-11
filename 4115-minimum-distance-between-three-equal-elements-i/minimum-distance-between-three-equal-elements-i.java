class Solution {
    public int minimumDistance(int[] arr) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int ele1=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==ele1){
                    int ele2=arr[j];
                    for(int k=j+1;k<arr.length;k++){
                        if(arr[k]==ele2){
                            ans=Math.min(ans,(j-i)+(k-j)+(k-i));
                        }
                    }
                    
                }
               
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
        
    }
}