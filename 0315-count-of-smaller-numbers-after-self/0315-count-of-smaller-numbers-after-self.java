class Solution {
    class Pair{
        int val;
        int idx;
        public Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public void mergeSort(Pair arr[],int[] ans,int s,int mid,int e){
        int i=s;
        int j=mid+1;
        Pair currArr[]=new Pair[e-s+1];
        int idx=0;
        while(i<=mid && j<=e){
            if(arr[i].val>arr[j].val){
                currArr[idx++]=new Pair(arr[i].val,arr[i].idx);
                ans[arr[i].idx]+=e-j+1;
                i++;
            }
            else{
                currArr[idx++]=new Pair(arr[j].val,arr[j].idx);
                j++;

            }
        }
        while(i<=mid){
            currArr[idx++]=new Pair(arr[i].val,arr[i].idx);
            i++;

        }
        while(j<=e){
            currArr[idx++]=new Pair(arr[j].val,arr[j].idx);
            j++;
        }
        for(i=0;i<currArr.length;i++){
            arr[s+i]=currArr[i];
        }


    }
    public void find(Pair[] arr,int[] ans,int s,int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        find(arr,ans,s,mid);
        find(arr,ans,mid+1,e);
        mergeSort(arr,ans,s,mid,e);


    }
    public List<Integer> countSmaller(int[] a) {
        int ans[]=new int[a.length];
        List<Integer> al=new ArrayList<>(a.length);
        Pair[] arr=new Pair[a.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=new Pair(a[i],i);
        }
        find(arr,ans,0,arr.length-1);
        for(int i=0;i<ans.length;i++){
            al.add(ans[i]);
        }
        return al;

        
    }
}