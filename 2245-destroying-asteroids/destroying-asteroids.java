class Solution {
    public boolean asteroidsDestroyed(int mass, int[] arr) {
        Arrays.sort(arr);
        if(arr[0]>mass){
            return false;
        }
        long nm=mass;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>nm){
                return false;
            }
            nm=nm+arr[i];
        }
        return true;
    }
}