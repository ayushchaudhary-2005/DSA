class Solution {
    public boolean find(int node,ArrayList<ArrayList<Integer>> adj,boolean path[],boolean visited[]){
        visited[node]=true;
        path[node]=true;
        for(int i=0;i<adj.get(node).size();i++){
            int neighbor=adj.get(node).get(i);
            if(visited[neighbor] && path[neighbor]){
                return true;
            }
            else if(!visited[neighbor]){
                if(find(neighbor,adj,path,visited)){
                    return true;
                }
            }
        }
        path[node]=false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] arr) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            int u=arr[i][0];
            int v=arr[i][1];
            adj.get(v).add(u);
        }
        boolean visited[]=new boolean[numCourses];
        boolean path[]=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(find(i,adj,path,visited)){
                    return false;
                }
            }
        }
        return true;
        
    }
}