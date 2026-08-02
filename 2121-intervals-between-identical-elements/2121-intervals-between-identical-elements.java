class Solution {
    public long[] getDistances(int[] arr) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            if(!hm.containsKey(curr)){
                hm.put(curr,new ArrayList<>());
                hm.get(curr).add(i);
            }
            else{
                hm.get(curr).add(i);

            }
        }
        long ans[]=new long[arr.length];
        for(int i:hm.keySet()){
            ArrayList<Integer> al=hm.get(i);
            long ps[]=new long[al.size()];
            long cs=0;
            for(int j=0;j<al.size();j++){
                cs=cs+al.get(j);
                ps[j]=cs;
            }
            for(int j=0;j<al.size();j++){
                long leftVal = 0;
                if (j != 0) {
                    leftVal = 1L * j * al.get(j) - ps[j - 1];
                }

                long rightVal = 0;
                if (j != al.size() - 1) {
                    rightVal = (ps[al.size() - 1] - ps[j])- 1L * al.get(j) * (al.size() - j - 1);
                }
                ans[al.get(j)]=leftVal+rightVal;
            }
        }
        return ans;
        
    }
}