class Solution {
    class Pair{
        int x;
        int y;
        int sum;
        public Pair(int x,int y,int sum){
            this.x=x;
            this.y=y;
            this.sum=sum;
        }
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.sum)-(b.sum));
        pq.add(new Pair(0,0,nums1[0]+nums2[0]));
        HashSet<String> hs=new HashSet<>();
        hs.add("0-0");
        List<List<Integer>> al=new ArrayList<>();
        while(k>0 && !pq.isEmpty()){
            Pair curr=pq.poll();
            int i=curr.x;
            int j=curr.y;
            k--;
            List<Integer> nal=new ArrayList<>();
            nal.add(nums1[i]);
            nal.add(nums2[j]);
            al.add(nal);
            if(i+1<nums1.length && !hs.contains((i+1)+"-"+j)){
                pq.add(new Pair(i+1,j,nums1[i+1]+nums2[j]));
                hs.add((i+1)+"-"+j);
            }
            if(j+1<nums2.length && !hs.contains(i+"-"+(j+1))){
                pq.add(new Pair(i,j+1,nums1[i]+nums2[j+1]));
                hs.add(i+"-"+(j+1));
            }
        }
        

        return al;
        
    }
}