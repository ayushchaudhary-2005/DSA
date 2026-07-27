class Solution {
    public int findLongestChain(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int prevEnd=arr[i][1];
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j][0]>prevEnd){
                    count++;
                    prevEnd=arr[j][1];
                }

            }
            ans=Math.max(ans,count);
        }
        return ans;
        
    }
}