class Solution {
    public int sumCounts(List<Integer> arr){
        int ans=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i;j<arr.size();j++){
                 HashSet<Integer> hs=new HashSet<>();
                 for(int k=i;k<=j;k++){
                    hs.add(arr.get(k));
                }
                 int size=hs.size();
                 ans=ans+size*size;
            }
        }
        return ans;
    }
}