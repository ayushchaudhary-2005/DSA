class Solution {
    public void find(int arr[],int idx,List<List<Integer>> ans,List<Integer> al,boolean visited[]){
        if(idx==arr.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1] && !visited[i-1]){
                continue;
            }
            if(!visited[i]){
                al.add(arr[i]);
                visited[i]=true;
                find(arr,idx+1,ans,al,visited);
                visited[i]=false;
                al.remove(al.size()-1);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        boolean visited[]=new boolean[arr.length];
        find(arr,0,ans,al,visited);
        return ans;
        
    }
}