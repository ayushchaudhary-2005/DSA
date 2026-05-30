class Solution {
    public int countSubarrays(int[] arr) {
        int s=0;
        int e=0;
        int ans=0;
        while(e<arr.length){
            if((e-s+1)==3){
                float fn=arr[s];
                float ln=arr[e];
                float mid=arr[s+1];
                if((fn+ln)==mid/2){
                    ans++;
                }
                s++;
            }
            e++;
        }
        return ans;
        
    }
}