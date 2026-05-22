class Solution {
    public long maxArrayValue(int[] a) {
        if(a.length==1){
            return (long)a[0];
        }
        long max=0;
        long arr[]=new long[a.length];
        for(int i=0;i<a.length;i++){
            arr[i]=a[i];
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<=arr[i+1]){
                arr[i]=arr[i]+arr[i+1];
                max=Math.max(max,arr[i]);
            }
            else{
                max=Math.max(max,arr[i]);
            }
        }
        return max;
    }
}