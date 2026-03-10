// User function Template for Java

class Solution {
    public int isNegativeWeightCycle(int n, int[][] edges) {
        // code here
        int[] dist=new int[n];
        
        
        
        for(int k=0;k<n-1;k++)
        {
            for(int i=0;i<edges.length;i++)
            {
                int u=edges[i][0];
                int v=edges[i][1];
                int w=edges[i][2];
                
                if(dist[u]+w<dist[v])
                {
                    dist[v]=dist[u]+w;
                }
            }
        }
        
        for(int i=0;i<edges.length;i++)
            {
                int u=edges[i][0];
                int v=edges[i][1];
                int w=edges[i][2];
                
                if(dist[u]+w<dist[v])
                {
                    return 1;
                }
            }
            
            return 0;
    }
}