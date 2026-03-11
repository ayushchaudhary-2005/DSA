class Solution {
    public int findMaxLength(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int cs=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cs-=1;
            }
            else{
                cs+=1;
            }
             if(!hm.containsKey(cs)){
                hm.put(cs,i);
            }
            if(hm.containsKey(cs)){
                ans=Math.max(ans,i-hm.get(cs));
            }
        }
        return ans;

        
    }
}