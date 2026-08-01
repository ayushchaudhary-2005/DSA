class Solution {
    public int find(int arr[],int val){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<=val){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return s;
    }
    public List<Long> minOperations(int[] arr, int[] queries) {
        Arrays.sort(arr);
        long ps[]=new long[arr.length];
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            ps[i]=sum;
        }
        List<Long> ans=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            int num=queries[i];
            int nextGreaterIdx=find(arr,num);
            long leftVal=0;
            long rightVal=0;
            if(nextGreaterIdx!=0){
                leftVal=Math.abs((nextGreaterIdx*(long)num)-(ps[nextGreaterIdx-1]));
                rightVal=Math.abs((ps[arr.length-1]-ps[nextGreaterIdx-1])-((arr.length-nextGreaterIdx)*(long)num));
            }
            else{
                if(nextGreaterIdx==0){
                    rightVal=Math.abs((ps[arr.length-1])-((arr.length-nextGreaterIdx)*(long)num));
                }
                if(nextGreaterIdx==arr.length){
                    leftVal=Math.abs((nextGreaterIdx*(long)num)-(ps[nextGreaterIdx-1]));

                }
            }
            ans.add(leftVal+rightVal);
        }
        return ans;
        
    }
}