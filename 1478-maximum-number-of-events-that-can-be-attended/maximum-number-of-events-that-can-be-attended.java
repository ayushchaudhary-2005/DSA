class Solution {
    public int maxEvents(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int day=arr[0][0];
        int ans=0;
        int i=0;
        while(!pq.isEmpty() || i<arr.length){
           if(pq.isEmpty()){
            day=arr[i][0];
           }
           while(i<arr.length && day==arr[i][0]){
            pq.add(arr[i][1]);
            i++;
           }
           if(!pq.isEmpty()){
            pq.poll();
            ans++;
           }
           day++;
           while(!pq.isEmpty() && pq.peek()<day){
            pq.poll();
           }
        }
        return ans;
        
    }
}