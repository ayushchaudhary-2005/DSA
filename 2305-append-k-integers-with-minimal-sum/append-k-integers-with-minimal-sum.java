class Solution {
    public long minimalKSum(int[] arr, int k) {
      long sum=0;
      TreeSet<Integer> hm=new TreeSet<>();
      for(int i:arr){
        hm.add(i);
      }
      long start=1;
      for(int i:hm){
        long l=start;
        long r=i;
        if(k>(r-l)){
            k=k-(int)(r-l);
            long rm1Sum=r*(r-1)/2;
            long lm1Sum=l*(l-1)/2;
            sum=sum+(rm1Sum-lm1Sum);
        }
        else{
            break;
        }
        start=r+1;
      }
      long l=start;
      long r=start+k;
      long rm1Sum=r*(r-1)/2;
      long lm1Sum=l*(l-1)/2;
      sum=sum+(rm1Sum-lm1Sum);
      return sum;


        
    }
}