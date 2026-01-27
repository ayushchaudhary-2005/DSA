class Solution {
    public void find(int arr[],ArrayList<Integer> al,List<List<Integer>> ans,int idx,boolean visited[]){
        if(al.size()==arr.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                al.add(arr[i]);
                visited[i]=true;
                find(arr,al,ans,idx+1,visited);
                al.remove(al.size()-1);
                visited[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean visited[]=new boolean[arr.length];
        ArrayList<Integer> al=new ArrayList<>();
        find(arr,al,ans,0,visited);
        return ans;
        
    }
}