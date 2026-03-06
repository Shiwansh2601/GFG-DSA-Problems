class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            graph.add(new ArrayList<>());
            
        }
        
        for(int i=0;i<edges.length;i++)
        {
            graph.get(edges[i][0]).add(edges[i][1]);
        }
        
        boolean[] vis=new boolean[V];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            dfs(graph,vis,st,i);
        }
        
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            ans.add(st.pop());
        }
        
        return ans;
    }
    
    public void dfs(ArrayList<ArrayList<Integer>>graph,boolean[] vis,Stack<Integer>st,int curr)
    {
        vis[curr]=true;
        for(int i=0;i<graph.get(curr).size();i++)
        {
            int x=graph.get(curr).get(i);
            
            if(!vis[x])
            {
                dfs(graph,vis,st,x);
            }
        }
        
        st.push(curr);
    }
}