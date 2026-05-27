class Solution {
    class Pair{
        int max;
        int idx;
        public Pair(int max,int idx){
            this.max=max;
            this.idx=idx;
        }
    }
    public List<Integer> maxScoreIndices(int[] arr) {
        int zc[]=new int[arr.length];
        int oc[]=new int[arr.length];
        int zeroCount=0;
        int oneCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroCount++;
                zc[i]=zeroCount;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==1){
                oneCount++;
                oc[i]=oneCount;
            }
        }
        List<Pair> al=new ArrayList<>();
        int max=0;
        int leftVal=oc[0];
        max=leftVal;
        al.add(new Pair(max,0));
        int rightVal=zc[arr.length-1];
        max=Math.max(leftVal,rightVal);
        al.add(new Pair(rightVal,arr.length));
        for(int i=1;i<arr.length;i++){
            int val=zc[i-1]+oc[i];
            max=Math.max(val,max);
            al.add(new Pair(val,i));
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<al.size();i++){
            Pair curr=al.get(i);
            if(curr.max==max){
                ans.add(curr.idx);
            }
        }
        return ans;

        
    }
}