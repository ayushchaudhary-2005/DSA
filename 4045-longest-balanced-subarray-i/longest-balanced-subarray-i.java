class Solution {
    public int longestBalanced(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            HashSet<Integer> odd=new HashSet<>();
        HashSet<Integer> even=new HashSet<>();
            if(arr[i]%2==0){
                even.add(arr[i]);
                
            }
            else{
                odd.add(arr[i]);
            }
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]%2==0){
                    even.add(arr[j]);
                }
                else{
                    odd.add(arr[j]);
                }
                if(even.size()==odd.size()){
                    ans=Math.max(ans,j-i+1);

                }

            }
        }
        return ans;
        
    }
}