class Solution {
    public int minimumDistance(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int max=0;
        for(int i:arr){
            max=Math.max(i,max);
        }
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
       for(int i=0;i<max+1;i++){
            al.add(new ArrayList<>());
        }
        int e=0;
        int ans=Integer.MAX_VALUE;
        while(e<arr.length){
            hm.put(arr[e],hm.getOrDefault(arr[e],0)+1);
            al.get(arr[e]).add(e);
            if(hm.get(arr[e])>=3){
                ArrayList<Integer> nal=al.get(arr[e]);
                int i=nal.get(0);
                int j=nal.get(1);
                int k=nal.get(2);
                if(nal.size()>3){
                    k=nal.get(nal.size()-1);
                    j=nal.get(nal.size()-2);
                    i=nal.get(nal.size()-3);
                }
                ans=Math.min(ans,(j-i)+(k-i)+(k-j));
            }
            e++;
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
        
    }
}