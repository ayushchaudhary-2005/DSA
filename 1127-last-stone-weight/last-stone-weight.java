class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:arr){
            pq.add(i);
        }
        while(pq.size()>1){
            int y=pq.poll();
            int x=pq.poll();
            if(x!=y){
                pq.add(y-x);
            }
        }
        return pq.isEmpty()?0:pq.peek();
        
    }
}