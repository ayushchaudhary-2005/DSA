class Solution {
    class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public boolean isValid(int r,int c,char arr[][]){
        return (r>=0 && r<arr.length && c>=0 && c<arr[0].length);
    }
    public void find(int r,int c,char arr[][],boolean visited[][],Queue<Pair> q){
        q.add(new Pair(r,c));
        visited[r][c]=true;
        int rarr[]={1,-1,0,0};
        int carr[]={0,0,1,-1};
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int row=curr.x;
            int col=curr.y;
            for(int i=0;i<4;i++){
                int newr=row+rarr[i];
                int newc=col+carr[i];
                if(isValid(newr,newc,arr) && !visited[newr][newc] && arr[newr][newc]=='1'){
                    visited[newr][newc]=true;
                    q.add(new Pair(newr,newc));
                }
            }

            
        }


    }
    public int numIslands(char[][] arr) {
        int ans=0;
        Queue<Pair> q=new LinkedList<>();
        boolean visited[][]=new boolean[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(!visited[i][j] && arr[i][j]=='1'){
                    find(i,j,arr,visited,q);
                    ans++;

                }
            }
        } 
        return ans;
       
        
    }
}