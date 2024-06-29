class Solution {
    public String convert(String s, int numRows) {
        int n= s.length();
        char arr[][] = new char[numRows][n];
        int row = 0;
        int col =0;
        int cur =0;
        while( cur < n)
        {
            while(row < numRows && cur < n)
            {
                arr[row][col] = s.charAt(cur);
                row++;
                cur++;
            }
            row = Math.max(0,row-2);
            while(row > 0 && cur < n)
            {
                arr[row--][++col] = s.charAt(cur++); // row is decremented to move up,col is firstly incremented because initially it is at col 0 but my first value comes in at only col 1
            }
            col++;
        }
        StringBuilder res = new StringBuilder();
        for(int i =0;i<numRows;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j] != 0)
                {
                res.append(arr[i][j]);
                }
            }
        }
        return res.toString();
    }
}