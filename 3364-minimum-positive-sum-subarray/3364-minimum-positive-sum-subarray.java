class Solution {
    public int minimumSumSubarray(List<Integer> arr, int l, int r) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            for(int j=i;j<arr.size();j++){
                int count=0;
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr.get(k);
                    count++;
                    if(sum>0 && count>=l && count<=r){
                        ans=Math.min(ans,sum);
                    }
    

                }
            }
            
        }
        return ans==Integer.MAX_VALUE?-1:ans;


        
    }
}