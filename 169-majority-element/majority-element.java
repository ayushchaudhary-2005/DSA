class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int ans=-1;
        int hl=arr.length/2;
        for(int i:hm.keySet()){
            if(hm.get(i)>hl){
                ans=i;
                break;
            }
        }
        return ans;
        
    }
}