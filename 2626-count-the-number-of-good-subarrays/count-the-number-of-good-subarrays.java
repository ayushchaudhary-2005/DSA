class Solution {
    public long countGood(int[] arr, int k) {
        long ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        long pairs=0;
        int s=0;
        int e=0;
        while(e<arr.length){
            int curr=arr[e];
            if(!hm.containsKey(curr)){
                hm.put(curr,1);
            }
            else{
                pairs=pairs+hm.get(curr);
                hm.put(curr,hm.get(curr)+1);
            }
            while (pairs >= k) {
                ans += (arr.length - e);
                int newCurr = arr[s];
                hm.put(newCurr, hm.get(newCurr) - 1);
                pairs -= hm.get(newCurr);
                s++;
            }
            e++;
        }
        return ans;

        
    }
}