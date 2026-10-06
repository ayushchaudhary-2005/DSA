class Solution {
    public int findDuplicate(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int currEle=Math.abs(arr[i]);
            if(arr[currEle-1]<0){
                return currEle;
            }
            arr[currEle-1]=arr[currEle-1]*(-1);
        }
        return -1;
        
    }
}