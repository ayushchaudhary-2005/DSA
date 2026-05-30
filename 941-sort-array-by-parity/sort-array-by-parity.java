class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int l=0;    
        int r=arr.length-1;
        while(r>l){
            if(arr[r]%2==0){
                while(l<r && arr[l]%2==0){
                    l++;
                }
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
            r--;
        }
        return arr;
        
    }
}