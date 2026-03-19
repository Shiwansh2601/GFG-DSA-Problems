// User function Template for Java
class Solution {
    boolean check(int n, int m, ArrayList<ArrayList<Integer>> edges) {
        // code here
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<m;i++)
        {
            int u=edges.get(i).get(0)-1;
            int v=edges.get(i).get(1)-1;
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        boolean[] vis=new boolean[n];
        
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                if(dfs(i,vis,graph,1,n))
                return true;
            }
        }
        
        return false;
       
    }
    
     boolean dfs(int curr,boolean[] vis, ArrayList<ArrayList<Integer>>graph,int pos,int n)
        {
            vis[curr]=true;
            
            for(int i=0;i<graph.get(curr).size();i++)
            {
                int x=graph.get(curr).get(i);
                if(pos==n)
                {
                    return true;
                }
                
                if(!vis[x])
                {
                    if(dfs(x,vis,graph,pos+1,n))
                    return true;
                    
                }
            }
            
            return vis[curr]=false;
            
        }
}