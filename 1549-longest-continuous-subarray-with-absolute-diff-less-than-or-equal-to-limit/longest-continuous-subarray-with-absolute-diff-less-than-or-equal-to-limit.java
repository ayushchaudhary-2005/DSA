class Solution {
    public int longestSubarray(int[] arr, int limit) {
        int s=0;
        int e=1;
        int min=arr[0];
        int max=arr[0];
        int maxLen=1;
        PriorityQueue<int[]> pq1=new PriorityQueue<>((a,b)->a[0]-b[0]);
        PriorityQueue<int[]> pq2=new PriorityQueue<>((a,b)->b[0]-a[0]);
        pq1.add(new int[]{arr[0],0});
        pq2.add(new int[]{arr[0],0});
        while(e<arr.length){
            int curr=arr[e];
            if(Math.abs(curr-max)<=limit &&
               Math.abs(curr-min)<=limit){
                pq1.add(new int[]{arr[e],e});
                pq2.add(new int[]{arr[e],e});
                maxLen=Math.max(maxLen,e-s+1);
                max=Math.max(max,arr[e]);
                min=Math.min(min,arr[e]);
            }
            else{
                while(s<e &&((Math.abs(pq1.peek()[0]-curr)>limit) ||(Math.abs(pq2.peek()[0]-curr)>limit))){
                    int min1=pq1.peek()[0];
                    int idx1=pq1.peek()[1];
                    int max1=pq2.peek()[0];
                    int idx2=pq2.peek()[1];
                    if(arr[s]==min1 && idx1==s){
                        pq1.poll();
                    }
                    if(arr[s]==max1 && idx2==s){
                        pq2.poll();
                    }
                    s++;
                    while(!pq1.isEmpty() && pq1.peek()[1] < s){
                        pq1.poll();
                    }
                    while(!pq2.isEmpty() && pq2.peek()[1] < s){
                        pq2.poll();
                    }
                }

                pq1.add(new int[]{curr,e});
                pq2.add(new int[]{curr,e});

                if(!pq1.isEmpty()){
                    min=pq1.peek()[0];
                }
                else{
                    min=curr;
                }

                if(!pq2.isEmpty()){
                    max=pq2.peek()[0];
                }
                else{
                    max=curr;
                }
                maxLen=Math.max(maxLen,e-s+1);
            }

            e++;
        }

        return maxLen;
    }
}