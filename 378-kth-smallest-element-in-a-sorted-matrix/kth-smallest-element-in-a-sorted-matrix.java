class Solution {
    public int kthSmallest(int[][] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(pq.size()==k && pq.peek()>arr[i][j]){
                    pq.poll();
                    pq.add(arr[i][j]);
                }
                if(pq.size()<k){
                    pq.add(arr[i][j]);
                }
            }
        }
        return pq.peek();
        
    }
}