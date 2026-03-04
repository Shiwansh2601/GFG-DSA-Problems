// User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        
        int E=edges.length;
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            ans.add(new ArrayList<>());
        }
        
        for(int i=0;i<E;i++)
        {
            addEdge(ans,edges[i][0],edges[i][1]);
        }
        
        return ans;
        
    }
    
    public void addEdge(List<List<Integer>>ans,int u,int v)
    {
        ans.get(u).add(v);
        ans.get(v).add(u);
    }
}