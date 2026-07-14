class Solution {
    public int minLength(int[] arr, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int cs=0;
        int e=0;
        int s=0;
        int ans=Integer.MAX_VALUE;
        while(e<arr.length){
            int curr=arr[e];
            if(hm.containsKey(curr)){
                hm.put(arr[e],hm.get(arr[e])+1);
                e++;
                continue;
            }
            else{
                hm.put(curr,1);
                cs=cs+curr;
            }
            if(cs>=k){
                ans=Math.min(ans,e-s+1);
                while(cs>=k && s<=e){
                    ans=Math.min(ans,e-s+1);
                    if(hm.get(arr[s])!=1){
                        hm.put(arr[s],hm.get(arr[s])-1);

                    }
                    else{
                         cs=cs-arr[s];
                         hm.remove(arr[s]);
                    }
                    s++;
                }
            }
            e++;
        } 
        return ans==Integer.MAX_VALUE?-1:ans;
        
        
    }
}