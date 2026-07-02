class Solution {
    class Pair{
        int x;
        int y;
        int currHealth;
        public Pair(int x,int y,int currHealth){
            this.x=x;
            this.y=y;
            this.currHealth=currHealth;
        }
    }
    public boolean isValid(int x,int y,List<List<Integer>> arr){
        return (x>=0 && x<arr.size() && y>=0 && y<arr.get(0).size());
    }
    int dx[]={0,0,1,-1};
    int dy[]={1,-1,0,0};
    public boolean findSafeWalk(List<List<Integer>> arr, int health) {
        if(health==1 && (arr.get(0).get(0)==1 || arr.get(arr.size()-1).get(arr.get(0).size()-1)==1)){
            return false;
        }
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->b.currHealth-a.currHealth);
        if(arr.get(0).get(0)==1){
            q.add(new Pair(0,0,health-1));
        }
        else{
            q.add(new Pair(0,0,health));
        }
        boolean visited[][]=new boolean[arr.size()][arr.get(0).size()]; 
        visited[0][0]=true;
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int x=curr.x;
            int y=curr.y;
            if(x==arr.size()-1 && y==arr.get(0).size()-1){
                return true;
            }
            int currHealth=curr.currHealth;
            for(int i=0;i<4;i++){
                int nx=dx[i]+x;
                int ny=dy[i]+y;
                if(isValid(nx,ny,arr) && !visited[nx][ny]){
                    if(arr.get(nx).get(ny)==1){
                        if(currHealth-1>0){
                            q.add(new Pair(nx,ny,currHealth-1));
                            visited[nx][ny]=true;
                        }
                    }
                    else{
                        q.add(new Pair(nx,ny,currHealth));
                        visited[nx][ny]=true;

                }
            }}


        }
        return false;
        
        
    }
}