class Solution {
    class Pair {
        int row, col, k, steps;

        Pair(int r, int c, int k, int s) {
            this.row = r;
            this.col = c;
            this.k = k;
            this.steps = s;
        }
    }

    public int shortestPath(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        boolean[][][] visited = new boolean[m][n][k + 1];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0, k, 0));
        visited[0][0][k] = true;
        int[] dx = { 1, -1, 0, 0 };
        int[] dy = { 0, 0, 1, -1 };
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int r = curr.row;
            int c = curr.col;
            int remK = curr.k;
            int steps = curr.steps;
            if (r == m - 1 && c == n - 1) {
                return steps;
            }
            for (int i = 0; i < 4; i++) {
                int nr = r + dx[i];
                int nc = c + dy[i];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n) {

                    int newK = remK - grid[nr][nc];

                    if (newK >= 0 && !visited[nr][nc][newK]) {
                        visited[nr][nc][newK] = true;
                        q.add(new Pair(nr, nc, newK, steps + 1));
                    }
                }
            }
        }

        return -1;
    }
}