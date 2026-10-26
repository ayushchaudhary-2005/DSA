class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int i=0;
        HashSet<ArrayList<Integer>> hs=new HashSet<>();
        while(i<arr.length-2){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    ArrayList<Integer> al=new ArrayList<>();
                    al.add(arr[i]);al.add(arr[j]);al.add(arr[k]);
                    if(!hs.contains(al)){
                        hs.add(al);
                        ans.add(al);
                    }
                    j++;
                    k--;
                }
                else if(sum>0){
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