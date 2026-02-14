class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        for(int i=arr.size()-2;i>=0;i--){
            for(int j=0;j<arr.get(i).size();j++){
                int below=arr.get(i).get(j)+arr.get(i+1).get(j);
                int br=arr.get(i).get(j)+arr.get(i+1).get(j+1);
                arr.get(i).set(j,Math.min(below,br));
            }
        }
        return arr.get(0).get(0);
        
    }
}