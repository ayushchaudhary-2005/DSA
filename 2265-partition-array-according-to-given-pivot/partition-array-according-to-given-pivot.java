class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        ArrayList<Integer> a3=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<pivot){
                a1.add(arr[i]);
            }
            else if(arr[i]==pivot){
                a2.add(arr[i]);
            }
            else{
                a3.add(arr[i]);
            }

        }
        int ans[]=new int[a1.size()+a2.size()+a3.size()];
        int idx=0;
        for(int i=0;i<a1.size();i++){
            ans[idx++]=a1.get(i);
        }
        for(int i=0;i<a2.size();i++){
            ans[idx++]=a2.get(i);
        }
        for(int i=0;i<a3.size();i++){
            ans[idx++]=a3.get(i);
        }
        return ans;
        
    }
}