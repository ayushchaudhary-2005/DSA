class Solution {
    public int minStoneSum(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        long sum=0;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            sum+=arr[i];
        }
        while(k-->0){
            int val=pq.poll();
            sum=sum-val/2;
            pq.add(val-val/2);
        }
        return (int)sum;
    }
}