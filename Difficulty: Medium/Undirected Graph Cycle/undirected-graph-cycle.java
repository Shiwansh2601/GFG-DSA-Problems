class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        int E=edges.length;
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<E;i++)
        {
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
        
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                if(dfs(graph,vis,i,-1))
                return true;
            }
        }
        
        return false;
    }
    
    public boolean dfs(ArrayList<ArrayList<Integer>>graph,boolean[] vis,int curr,int par){
        
        vis[curr]=true;
        for(int i=0;i<graph.get(curr).size();i++)
        {
            int x=graph.get(curr).get(i);
            
            //case 1
            if(vis[x] && x!=par)
            return true;
            
            //case 2
            
            else if(!vis[x])
            {
                if(dfs(graph,vis,x,curr))
                return true;
            }
        }
        
        return false;
        
    }
}