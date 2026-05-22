class Solution {
    public boolean find(int arr[],int idx,Boolean visited[]){
        if(idx==arr.length-1){
            return true;
        }
        if(idx>=arr.length){
            return false;
        }
        if(visited[idx]!=null){
            return visited[idx];
        }
        for(int i=1;i<=arr[idx];i++){
            boolean canReach=find(arr,idx+i,visited);
            if(canReach){
                return true;
            }

        }
        return visited[idx]=false;
    }
    public boolean canJump(int[] arr) {
        Boolean visited[]=new Boolean[arr.length];
        return find(arr,0,visited);
        
    }
}