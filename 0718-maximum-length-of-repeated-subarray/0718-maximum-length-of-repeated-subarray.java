class Solution {
    public int findLength(int[] arr1, int[] arr2) {
        int ans=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    int k=i;
                    int l=j;
                    int c=0;
                    while(k<arr1.length && l<arr2.length && arr1[k]==arr2[l]){
                        c++;
                        k++;
                        l++;
                    }
                    ans=Math.max(ans,c);
                }
            }
        }
        return ans;
        
    }
}