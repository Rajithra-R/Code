class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};
        int visited[][] = new int[m][n];
        
        // based on row
        for(int j=0;j<n;j++)  // any col
        {
            // 1st row
            if(visited[0][j] == 0 && board[0][j] == 'O')
            {
                dfs(0,j,m,n,drow,dcol,board,visited);
            }
            // last row
            if(visited[m-1][j] == 0 && board[m-1][j] == 'O')
            {
                dfs(m-1,j,m,n,drow,dcol,board,visited);
            }
        }
        
        // based on col
        for(int i=0;i<m;i++) // any row
        {
            // 1st col
            if(visited[i][0] == 0 && board[i][0] == 'O')
            {
                dfs(i,0,m,n,drow,dcol,board,visited);
            }
            // last col
            if(visited[i][n-1] == 0 && board[i][n-1] == 'O')
            {
                dfs(i,n-1,m,n,drow,dcol,board,visited);
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(visited[i][j] == 0 && board[i][j] == 'O')
                {
                    board[i][j] = 'X';
                }
            }
        }
    }
    public static void dfs(int row,int col,int m,int n,int[] drow,int[] dcol,char board[][],int visited[][])
    {
        visited[row][col] = 1;
        // neighbours
        for(int i=0;i<4;i++)
        {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && visited[nrow][ncol] == 0 && board[nrow][ncol] == 'O')
            {
                dfs(nrow,ncol,m,n,drow,dcol,board,visited);
            }
        }
    }
}