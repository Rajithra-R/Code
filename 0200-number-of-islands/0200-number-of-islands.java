class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        if(row == 0)  return 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j] == '1') // then  increment the count and mark all its neighbours
                {
                    count++;
                    MarkNeighbours(grid,i,j,row,col);
                }
            }
        }
        return count;
    }
    private void MarkNeighbours(char grid[][],int i,int j,int row,int col)
    {
        if(i < 0 || j < 0 || i >= row || j >= col|| grid[i][j] != '1')
        {
            return;
        }
        grid[i][j] = '0';  // u can use any number to mark the neighbours
        MarkNeighbours(grid,i-1,j,row,col); // up
        MarkNeighbours(grid,i+1,j,row,col); //down
        MarkNeighbours(grid,i,j-1,row,col); //left
        MarkNeighbours(grid,i,j+1,row,col); //right
    }
}