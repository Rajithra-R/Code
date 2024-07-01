class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> h = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j] != '.'){    // if that particular element is not empty then only enter the loop
                String rowEntry = "row" + i + board[i][j]; // Row constraint
                String colEntry = "col" + j + board[i][j]; // Column constraint
                String boxEntry = "box" + (i / 3) * 3 + (j / 3) + board[i][j]; // Box constraint
                    
                // If any entry is already in the HashSet, the board is invalid
                if(!h.add(rowEntry) || !h.add(colEntry) || !h.add(boxEntry)) 
                {
                    return false;
                }
                }
            }
        }
        return true;
    }
}