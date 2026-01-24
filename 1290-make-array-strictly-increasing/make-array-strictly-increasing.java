class Solution {
    public int search(int arr[],int prev){
        int s=0;
        int e=arr.length-1;
        int idx=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>prev){
                idx=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return idx;


    }
    public long find(int arr1[],int arr2[],int idx,int prev,HashMap<String,Long> dp){
        if(idx==arr1.length){
            return 0;
        }
        String ns=idx+","+prev;
        if(dp.containsKey(ns)){
            return dp.get(ns);
        }
        long skip=Integer.MAX_VALUE;
        if(arr1[idx]>prev){
            skip=find(arr1,arr2,idx+1,arr1[idx],dp);
        }
        int l=search(arr2,prev);
         long take = Integer.MAX_VALUE;
        if (l != -1) {
            take = 1 + find(arr1, arr2, idx + 1, arr2[l],dp); 
        } 
        long ans=Math.min(skip, take);
        String s=idx+","+prev;
        dp.put(s,ans);
        return ans;

    }
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        HashMap<String,Long> dp=new HashMap<>();
        Arrays.sort(arr2);
        long ans=find(arr1,arr2,0,-1,dp);
        if(ans>=Integer.MAX_VALUE){
            return -1;
        }
        return (int)ans;
        
    }
}