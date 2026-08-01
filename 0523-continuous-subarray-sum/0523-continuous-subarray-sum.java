class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int cs=0;
        hm.put(cs,-1);
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(hm.containsKey(cs%k) && (i-(hm.get(cs%k))>=2)){
                return true;

            }
            if(!hm.containsKey(cs%k)){
                hm.put(cs%k,i);
            }

        }
        return false;
        
    }
}