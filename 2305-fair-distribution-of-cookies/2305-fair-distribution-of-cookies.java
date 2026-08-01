class Solution {
    int ans=Integer.MAX_VALUE;
    public void find(int arr[],int count[],int idx){
        if(idx==arr.length){
            int max=0;
            for(int i:count){
                max=Math.max(i,max);
            }
            ans=Math.min(ans,max);
            return;
        }
        for(int j=0;j<count.length;j++){
            count[j]=count[j]+arr[idx];
            find(arr,count,idx+1);
            count[j]-=arr[idx];
        }
    }
    public int distributeCookies(int[] arr, int k) {
        int count[]=new int[k];
        find(arr,count,0);
        return ans;
        
    }
}