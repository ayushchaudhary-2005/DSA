class Solution {
    public int missingMultiple(int[] arr, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        int lar=0;
        for(int i=1;i<=100;i++){
            if(!hs.contains(i) && i%k==0){
                return i;
            }
            if(hs.contains(i) && i%k==0){
                if(lar<i){
                    lar=i;
                }
            }
        }
        return lar+k;

        
    }
}