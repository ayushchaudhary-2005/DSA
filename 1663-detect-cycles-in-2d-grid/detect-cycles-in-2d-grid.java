class Solution {
    boolean visited[][];

    public boolean find(int r,int c,char ch,char[][] arr,int count,int iniR,int iniC,
                        int prevR, int prevC) {

        // If we revisit start cell with count >= 4 -> cycle
        if(count >= 4 && r == iniR && c == iniC){
            return true;
        }

        // Boundaries or different character
        if(r < 0 || c < 0 || r >= arr.length || c >= arr[0].length || arr[r][c] != ch){
            return false;
        }

        // Already visited BUT not the previous cell → cycle
        if(visited[r][c] && !(r == prevR && c == prevC)) {
            return count >= 4;
        }

        visited[r][c] = true;

        // Explore neighbours (do NOT go back to previous cell)
        boolean up    = (r-1 != prevR || c != prevC) &&
                         find(r-1, c, ch, arr, count+1, iniR, iniC, r, c);

        boolean down  = (r+1 != prevR || c != prevC) &&
                         find(r+1, c, ch, arr, count+1, iniR, iniC, r, c);

        boolean left  = (r != prevR || c-1 != prevC) &&
                         find(r, c-1, ch, arr, count+1, iniR, iniC, r, c);

        boolean right = (r != prevR || c+1 != prevC) &&
                         find(r, c+1, ch, arr, count+1, iniR, iniC, r, c);

        return up || down || left || right;
    }

    public boolean containsCycle(char[][] arr) {
        int m = arr.length, n = arr[0].length;
        visited = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]) {
                    if(find(i, j, arr[i][j], arr, 0, i, j, -1, -1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}