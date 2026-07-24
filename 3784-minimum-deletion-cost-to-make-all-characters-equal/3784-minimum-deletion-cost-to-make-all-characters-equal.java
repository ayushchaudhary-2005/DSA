class Solution {
    class Pair{
        char ch;
        long val;
        public Pair(char ch,long val){
            this.ch=ch;
            this.val=val;
        }
    }
    public long minCost(String s, int[] cost) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Long.compare(a.val,b.val));
        HashMap<Character,Long> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           if(!hm.containsKey(ch)){
            hm.put(ch,(long)cost[i]);
           }
           else{
            long c=hm.get(ch);
            hm.put(ch,c+cost[i]);
           }
        }
        Set<Character> ks=hm.keySet();
        for(char ch:ks){
            pq.add(new Pair(ch,hm.get(ch)));
        }
        long ans=0;
        while(pq.size()>1 ){
            ans=ans+pq.poll().val;
        }
        return ans;
        
    }
}