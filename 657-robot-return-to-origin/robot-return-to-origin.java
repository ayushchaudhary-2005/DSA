class Solution {
    class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    
    }
    public boolean judgeCircle(String moves) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,0));
         for(int i=0;i<moves.length();i++){
            Pair cp=q.poll();
            int r=cp.x;
            int c=cp.y;
            char curr=moves.charAt(i);
            if(curr=='L'){
                q.add(new Pair(r,c-1));
            }
            else if(curr=='R'){
                q.add(new Pair(r,c+1));
            }
            else if(curr=='U'){
                q.add(new Pair(r-1,c));
            }
            else{
                q.add(new Pair(r+1,c));
            }
        }
        Pair curr=q.poll();
         if(curr.x==0 && curr.y==0){
            return true;
        }
        return false;

        
    }
}