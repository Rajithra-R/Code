// BFS TRAVERSAL


class Solution {
    static class Pair{
        int row,col,time;
        Pair(int row,int col,int time)
        {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        int visited[][] = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 2)
                {
                    q.add(new Pair(i,j,0)); // 0 - for time
                    visited[i][j] = 2;    
                }
                else
                {
                    visited[i][j] = 0;
                }
                if(grid[i][j] == 1) fresh++;
            }
        }
        int time = 0;
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};
        int count = 0;
        while(!q.isEmpty())
        {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            time = Math.max(time,t);
            q.remove();
            for(int i=0;i<4;i++)  // 4 directions
            {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1)
                {
                    q.add(new Pair(nrow,ncol,time+1));
                    visited[nrow][ncol] = 2;
                    count++;
                }
            }
        }
        return (count == fresh) ? time : -1;
    }
}