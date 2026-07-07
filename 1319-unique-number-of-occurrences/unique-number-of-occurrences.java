class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int maxFreq=0;
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            maxFreq=Math.max(maxFreq,hm.get(arr[i]));
        }
        int freq[]=new int[maxFreq+1];
        Set<Integer> ks=hm.keySet();
        for(int i:ks){
            int occurance=hm.get(i);
            if(freq[occurance]!=0){
                return false;
            }
            freq[occurance]=1;
        }
        return true;
        
    }
}