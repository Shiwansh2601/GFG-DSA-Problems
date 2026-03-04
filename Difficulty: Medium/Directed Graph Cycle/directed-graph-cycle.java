class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        boolean[] vis=new boolean[V];
        boolean[] stack=new boolean[V];
        
        ArrayList<ArrayList<Integer>>grid=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            grid.add(new ArrayList<>());
            
        }
        
        for(int i=0;i<edges.length;i++)
        {
            grid.get(edges[i][0]).add(edges[i][1]);
        }
        
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                 if(dfs(grid,vis,stack,i))
                 return true;
            }
        }
        
        return false;
        
    }
   
    public boolean dfs(ArrayList<ArrayList<Integer>>grid,boolean[] vis,boolean[] st,int curr){
        
        vis[curr]=true;
        st[curr]=true;
        
        for(int i=0;i<grid.get(curr).size();i++)
        {
            int x=grid.get(curr).get(i);
            
            if(st[x])
            return true;
            
            else if(!vis[x])
           {
               if( dfs(grid,vis,st,x))
               return true;
           }
        }
        
        return st[curr]=false;
    }
}