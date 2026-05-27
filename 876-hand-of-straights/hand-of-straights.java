class Solution {
    public boolean isNStraightHand(int[] arr, int k) {
        if((arr.length%k)!=0){
            return false;
        }
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        while(!hm.isEmpty()){
            int first=hm.firstKey();
            for(int i=0;i<k;i++){
                int curr=first+i;
                if(!hm.containsKey(curr)){
                    return false;
                }
                hm.put(curr,hm.get(curr)-1);
                if(hm.get(curr)==0){
                    hm.remove(curr);
                }
            }
        }
        return true;
        
        
    }
}