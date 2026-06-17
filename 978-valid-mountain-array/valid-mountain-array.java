class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<=2){
            return false;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        boolean increasing=false;
        boolean decreasing=false;
        int i=1;
        while(i<arr.length && arr[i]>=arr[i-1]){
            if(arr[i]==arr[i-1]){
                return false;
            }
            i++;

        }
        if(i==arr.length){
            return false;
        }
        while(i<arr.length-1){
            if(arr[i]==arr[i+1]){
                return false;
            }
            if(arr[i]<arr[i+1]){
                return false;
            }
            i++;
        }
        return true;

       
        
    }
}