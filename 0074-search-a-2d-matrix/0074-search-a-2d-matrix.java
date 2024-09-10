class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = FindRow(matrix,target);
        if(row != -1)
        {
            return binarySearch(row,matrix,target);
        }
        else
        {
            return false;
        }
    }
    public int FindRow(int[][] matrix,int target)  //iterate through the 1st col and find the row => row = mid | col = 0
    {
        int low = 0;
        int high = matrix.length - 1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(target >= matrix[mid][0] && target <= matrix[mid][matrix[0].length-1])  // 1 - last col
            {
                return mid;
            }
            else if(matrix[mid][0] < target) // col 1
            {
                low = mid + 1;
            }
            else if(matrix[mid][0] > target)  // col 1
            {
                high = mid - 1;
            }
        }
        return -1;
    }
    //initially we search the 1st col so col is 0 and row is mid
    //after we found col it is in the mid pos so col is mid and row is row in dex that has been found
    public boolean binarySearch(int row,int[][] matrix,int target) // => row = row | col = mid
    {
        int low = 0;
        int high = matrix[0].length - 1; //last element in that row
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(matrix[row][mid] == target)
            {
                return true;
            }
            else if(matrix[row][mid] < target)
            {
                low = mid + 1;
            }
            else if(matrix[row][mid] > target)
            {
                high = mid - 1;
            }
        }
        return false;
    }
}