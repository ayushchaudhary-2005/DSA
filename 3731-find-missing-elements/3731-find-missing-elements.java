class Solution {
    public List<Integer> findMissingElements(int[] arr) {
       Arrays.sort(arr);
       List<Integer> ans=new ArrayList<>();
       int s=arr[0];
       int i=0;
       while(i<arr.length){
        if(arr[i]==s){
            i++;
            s++;
        }
        else{
            ans.add(s);
            s++;
        }
       }
       return ans;
        
    }
}