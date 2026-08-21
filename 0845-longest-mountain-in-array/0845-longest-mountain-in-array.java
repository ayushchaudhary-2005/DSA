class Solution {
    public int longestMountain(int[] arr) {
        int ans=0;
        for(int i=1;i<arr.length-1;i++){
            int curr=arr[i];
            int j=i-1;
            int leftMin=arr[i];
            while(j>=0 && leftMin>arr[j]){
                leftMin=arr[j];
                j--;
            }
            if(i-j-1>0){
                int leftAns=i-j-1;
                int k=i+1;
                int rightMin=arr[i];
            while(k<arr.length && rightMin>arr[k]){
                rightMin=arr[k];
                k++;
            }
            if(k-i-1>0){
                ans=Math.max(ans,leftAns+1+k-i-1);
            }


            }

        }
        return ans;

        
    }
}