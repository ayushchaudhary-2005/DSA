class Solution {
    public void find(ArrayList<ArrayList<Integer>> al,boolean visited[],Stack<Integer> s,int node){
        visited[node]=true;
        for(int i=0;i<al.get(node).size();i++){
            int next=al.get(node).get(i);
            if(!visited[next]){
                find(al,visited,s,next);
            }
        }
        s.push(node);
    }
    public boolean isCycle(ArrayList<ArrayList<Integer>> al,boolean visited[],boolean path[],int node){
        visited[node]=true;
        path[node]=true;
        for(int i=0;i<al.get(node).size();i++){
            int next=al.get(node).get(i);
            if(visited[next] && path[next]){
                return true;
            }
            else if(!visited[next]){
                if(isCycle(al,visited,path,next)){
                    return true;
                }
            }
        }
        path[node]=false;
        return false;
    }
    public int[] findOrder(int n, int[][] arr) {
        int ans[]=new int[n];
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            int u=arr[i][0];
            int v=arr[i][1];
            al.get(v).add(u);
        }
        boolean visited[]=new boolean[n];
        boolean path[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(isCycle(al,visited,path,i)){
                return new int[]{};
            }
        }
        
        for(int i=0;i<n;i++){
            visited[i]=false;
        }
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            if(!visited[i]){
                find(al,visited,s,i);
            }
        }
        int i=0;
        while(!s.isEmpty()){
            ans[i++]=s.pop();

        }
        return ans;

        
    }
}