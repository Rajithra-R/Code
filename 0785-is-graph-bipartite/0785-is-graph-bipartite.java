// DFS

//Bipartite -  A GRAPH CAN BE COLOURED WITH 2 COLOURS SUCH THAT NO TWO ADJACENT COLOURS ARE SAME.

// A GRAPH WITH ODD LENGTH CYCLE - NOT BIPARTITE
// A GRAPH WITH NO CYCLE OR EVEN LENGTH CYCLE - BIPARTITE

// pick a node and colour (0) ..mark the visited array as its colour
// move to neighbour node and colur opposite colour and mark visited with its colour
// call dfs for all the nodes


class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int visited[] = new int[V];
        for(int i=0;i<V;i++)
        {
            visited[i] = -1;
        }
        for(int i=0;i<V;i++)
        {
            if(visited[i] == -1)
            {
                if(dfs(i,0,visited,graph,V)== false)
                    return false;
            }
        }
        return true;
    }
    public static boolean dfs(int node,int color,int[] visited,int[][] graph,int V)
    {
        visited[node] = color;
        // get the adjacent nodes
        for(int j : graph[node])
        {
            
            if(visited[j] == -1)
            {
                if(dfs(j,1-color,visited,graph,V) == false) return false;  // 1- color => colours alternatively
            }
            else if(visited[j] == color) return false;
        }
        
        return true;
    }
}