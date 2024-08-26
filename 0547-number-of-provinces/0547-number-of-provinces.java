class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] visited = new int[n];
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(visited[i] == 0)
            {
                dfs(isConnected,visited,i,n);
                count++;    // whenever it enters the if , the count is incremented 
            }
        }
        return count;
    }
        public void dfs(int isConnected[][],int visited[],int i,int n)
        {
            visited[i] = 1;
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j] == 1 && visited[j] == 0)
                {
                    dfs(isConnected,visited,j,n);
                }
            }
            
        }
    
}
/*
isConnected = [[1,1,0],[1,1,0],[0,0,1]]
initially visited array is 0 0 0 0 0 0 0 0 0 
i=0 => first ele is 1 and its visited is zero and hence mark it as 1 and iterate through the array
*/