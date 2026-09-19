class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int i=0;
        while(i<arr.length-2){
            while(i>0 && i<arr.length-2 && arr[i]==arr[i-1]){
                i++;
            }
            int j=i+1;
            int k=arr.length-1;
            List<Integer> al=new ArrayList<>();
            while(j<k){
                int currSum=arr[i]+arr[j]+arr[k];
                if(currSum==0){
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(arr[k]);
                    ans.add(new ArrayList<>(al));
                    al.clear();
                    int currJ=arr[j];
                    int currK=arr[k];
                    while(j<k && arr[j]==currJ){
                        j++;
                    }
                    while(k>j && arr[k]==currK){
                        k--;
                    }
                }
                else if(currSum>0){
                    k--;
                }
                else{
                    j++;
                }

            }
            i++;
        }
        return ans;
        
    }
}