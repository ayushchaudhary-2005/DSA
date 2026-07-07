class Solution {
    public int findShortestSubArray(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int maxFreq=0;
        int maxFreqEle=-1;
        Set<Integer> ks=hm.keySet();
        for(int i:ks){
            int freq=hm.get(i);
            if(maxFreq<freq){
                maxFreq=freq;
                maxFreqEle=i;
            }

        }
        if(maxFreq==1){
            return 1;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
           if(hm.get(arr[i])==maxFreq){
                int currAns=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]==arr[i]){
                        currAns++;
                    }
                    if(currAns==maxFreq){
                        ans=Math.min(ans,j-i+1);
                        break;
                    }
                }
           }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
        
    }
}