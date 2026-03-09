class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int ans=0;
        int c=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-1==arr[i-1]){
                c++;
                ans=Math.max(ans,c);
            }
            else if(arr[i]==arr[i-1]){
                continue;
            }
            else{
                c=0;
            }
        }
        return ans+1;
        
    }
}