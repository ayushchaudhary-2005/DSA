class Solution {
    public void find(int arr[],int idx,int prevIdx,List<List<Integer>> ans,List<Integer> al,HashSet<List<Integer>> hs){
        if(idx==arr.length){
            if(al.size()>=2 && !hs.contains(al)){
                ans.add(new ArrayList<>(al));
                hs.add(new ArrayList<>(al));
            }
            return;
        }
        if(prevIdx==-1 || arr[prevIdx]<=arr[idx]){
            al.add(arr[idx]);
            find(arr,idx+1,idx,ans,al,hs);
            al.remove(al.size()-1);
        }
        find(arr,idx+1,prevIdx,ans,al,hs);
        

    }
    public List<List<Integer>> findSubsequences(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        HashSet<List<Integer>> hs=new HashSet<>();
        find(arr,0,-1,ans,al,hs);
    
        return ans;
        
    }
}