class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {   // sr - start row ; sc - start col
        int initialcolor = image[sr][sc];
        int m = image.length;
        int n = image[0].length;
        int drow[] = {-1,0,1,0}; 
        int dcol[] = {0,1,0,-1};
        int ans[][] = image;
        dfs(image,sr,sc,color,initialcolor,m,n,drow,dcol,ans);
        return ans;
    }public void dfs(int[][] image, int row, int col, int color,int initialcolor,int m,int n,int[] drow,int[] dcol,int[][] ans)
    {
        ans[row][col] = color;
        for(int i=0;i<4;i++)
        {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && image[nrow][ncol] == initialcolor && ans[nrow][ncol] != color)
            {
                dfs(image,nrow,ncol,color,initialcolor,m,n,drow,dcol,ans);
            }
        }
    }
    }