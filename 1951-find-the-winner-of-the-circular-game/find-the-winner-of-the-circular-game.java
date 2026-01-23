class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            al.add(i);
        }
        int currIdx=0;
        while(al.size()>1){
            int idx=(currIdx+k-1)%al.size();
            currIdx=idx;
            al.remove(idx);
        }
        return al.get(0);
        
    }
}