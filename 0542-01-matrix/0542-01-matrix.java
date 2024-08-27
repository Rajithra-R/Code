class Solution {
    static class Pair{
        int row,col,step;
        Pair(int row,int col,int step)
        {
            this.row = row;
            this.col = col;
            this.step = step;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int vis[][] = new int[m][n];
        int dis[][] = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j] == 0)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 1;
                }
                else
                {
                     vis[i][j] = 0;
                }
            }
        }
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};
        while(!q.isEmpty())
        {
            int row = q.peek().row;
            int col = q.peek().col;
            int step = q.peek().step;
            q.remove();
            dis[row][col] = step;
            //neighbouring 
            for(int i=0;i<4;i++)
            {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol] != 1)
                {
                    vis[nrow][ncol] = 1;
                    q.add(new Pair(nrow,ncol,step+1));
                }
            }
        }
        return dis;
    }
}