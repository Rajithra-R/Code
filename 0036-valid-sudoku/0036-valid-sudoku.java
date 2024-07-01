class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> h = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j] != '.'){    // if that particular element is not empty then only enter the loop
                if(!h.add("row"+i+board[i][j]) || !h.add("col"+j+board[i][j]) || !h.add("box"+3*(i/3)+j/3+board[i][j]))
                {
                    return false;
                }
                }
            }
        }
        return true;
    }
}