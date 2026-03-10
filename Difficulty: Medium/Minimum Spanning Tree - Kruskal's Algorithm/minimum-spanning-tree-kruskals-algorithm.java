// User function Template for Java
class Solution {
    static int kruskalsMST(int V, int[][] edges) {
        // code here
        int[] par=new int[V];
        for(int i=0;i<V;i++)
        par[i]=i;
        
        int[] rank=new int[V];
        Arrays.fill(rank,0);
        
        Arrays.sort(edges,(a,b)->a[2]-b[2]);
        int cost=0;
        
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            
            int pu=find(par,u);
            int pv=find(par,v);
            
            if(pu!=pv)
            {
                cost+=edges[i][2];
                union(par,rank,u,v);
            }
        }
        
        return cost;
    }
    
    static int find(int[] par,int x)
    {
        if(x==par[x])
        return x;
        
        return par[x]=find(par,par[x]);
    }
    
   static  void union(int[] par,int[] rank,int x,int y)
    {
        int px=find(par,x);
        int py=find(par,y);
        
        if(px==py)
        return;
        
        if(rank[px]>rank[py])
        par[py]=px;
        else if(rank[px]<rank[py])
        par[px]=py;
        else
        {
            par[px]=py;
            rank[py]+=1;
        }
        
    }
}
