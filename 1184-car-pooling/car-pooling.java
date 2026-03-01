class Solution {
    public boolean carPooling(int[][] arr, int c) {
        ArrayList<ArrayList<Integer>> sidx=new ArrayList<>();
        ArrayList<ArrayList<Integer>> eidx=new ArrayList<>();
        for(int i=0;i<1001;i++){
            sidx.add(new ArrayList<>());
            eidx.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            sidx.get(arr[i][1]).add(i);
            eidx.get(arr[i][2]).add(i);
        }
        for(int i=0;i<=1000;i++){
            if(!eidx.get(i).isEmpty()){
                ArrayList<Integer> curr=eidx.get(i);
                for(int j=0;j<curr.size();j++){
                    c=c+arr[curr.get(j)][0];
                }
            }
            if(!sidx.get(i).isEmpty()){
                ArrayList<Integer> curr=sidx.get(i);
                for(int j=0;j<curr.size();j++){
                    c=c-arr[curr.get(j)][0];
                    if(c<0){
                    return false;
                }
                }
            }
        }
        return true;

        
        
    }
}