class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int count=0;
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
                s.pop();
                count++;
            }
            if(!s.isEmpty()){
                count++;
            }
            
            ans[i]=count;
            s.push(i);

        }
        return ans;
        
    }
}