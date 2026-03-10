class Solution {
    static class Pair{
        int node;
        int wt;
        
        Pair(int n,int w){
            this.node=n;
            this.wt=w;
        }
    }
    public int spanningTree(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Pair>>graph=new ArrayList<>();
        
        for(int i=0;i<V;i++)
        {
            graph.add(new ArrayList<>());
            
        }
        
        for(int i=0;i<edges.length;i++)
        {
            graph.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
            graph.get(edges[i][1]).add(new Pair(edges[i][0],edges[i][2]));
        }
        
        boolean[] vis=new boolean[V];
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        
        pq.add(new int[]{0,0});
        
        int cost=0;
        
        while(!pq.isEmpty())
        {
            int[] curr=pq.remove();
            
            int n=curr[0];
            int w=curr[1];
            
            if(!vis[n])
            {
                vis[n]=true;
                cost+=w;
                
                for(int i=0;i<graph.get(n).size();i++)
                {
                    Pair p=graph.get(n).get(i);
                    
                    if(!vis[p.node])
                    {
                        pq.add(new int[]{p.node,p.wt});
                    }
                }
            }
        }
        
        return cost;
    }
}
