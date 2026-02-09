class Solution {
    public int[] minOperations(String arr) {
        int ans[]=new int[arr.length()];
        for(int i=0;i<arr.length();i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(arr.charAt(j)=='1'){
                    count=count+Math.abs(i-j);
                }

            }
            for(int k=i+1;k<arr.length();k++){
                 if(arr.charAt(k)=='1'){
                    count=count+Math.abs(i-k);
                }

            }
            ans[i]=count;
        }
        return ans;
        
    }
}