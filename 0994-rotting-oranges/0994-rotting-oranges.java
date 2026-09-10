class Solution {
    public class Pair{
        int r;
        int c;
        public Pair(int r,int c){
            this.r=r;
            this.c=c;
        }
    }
    public boolean isValid(int arr[][],int r,int c){
        if(r>=0 && r<arr.length && c>=0 && c<arr[0].length){
            return true;
        }
        return false;
    }
    public int orangesRotting(int[][] grid) {
        int timer=0;
        Queue<Pair> q=new LinkedList<>();
        int oc=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    oc++;
                }
                else if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                }
            }

        }
        if(oc==0){
            return 0;
        }
        int r[]={1,-1,0,0};
        int c[]={0,0,1,-1};
        while(!q.isEmpty()){
            timer++;
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair curr=q.poll();
                int row=curr.r;
                int col=curr.c;
                for(int k=0;k<4;k++){
                    int nr=row+r[k];
                    int nc=col+c[k];
                    if(isValid(grid,nr,nc) && grid[nr][nc]==1){
                        q.add(new Pair(nr,nc));
                        grid[nr][nc]=0;
                        oc--;
                    }
                }
            }
        }
        return oc==0?timer-1:-1;

        
    }
}