class Solution {
    public long maxKelements(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        } 
        long ans=0;
        while(k-->0){
            int val=pq.poll();
            ans=ans+val;

            if(val%3==0){
                pq.add(val/3);
            }
            else{
                pq.add((val/3)+1);
            }
        }
        return ans;
    }
}