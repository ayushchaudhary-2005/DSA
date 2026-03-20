class Solution {
    public boolean asteroidsDestroyed(int mass, int[] arr) {
        Arrays.sort(arr);
        long currMass=(long)mass;
        for(int i=0;i<arr.length;i++){
            if(currMass<arr[i]){
                return false;
            }
            else{
                currMass=currMass+arr[i];
            }
        }
        return true;
        
    }
}