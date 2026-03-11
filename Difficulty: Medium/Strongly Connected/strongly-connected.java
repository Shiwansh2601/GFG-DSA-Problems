class Solution {
    // Function to find number of strongly connected components in the graph
    public int kosaraju(int V, int[][] edges) {
        // code here
        
        int m=edges.length;
        
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            graph.add(new ArrayList<>());
            
        }
        
        for(int i=0;i<m;i++)
        {
            graph.get(edges[i][0]).add(edges[i][1]);
        }
        
        boolean[] vis=new boolean[V];
        Stack<Integer>st=new Stack<>();
        // Step 1 Toposort
        
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                toposort(graph,i,vis,st);
            }
        }
        
        
        //Step 2 Transpose of graph
        
        List<List<Integer>>trans=new ArrayList<>();
         for(int i=0;i<V;i++)
        {
            trans.add(new ArrayList<>());
            
        }
        
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<graph.get(i).size();j++)
            {
                int v=graph.get(i).get(j);
                trans.get(v).add(i);
            }
        }
        
        // step 3 DFS
        int count=0;
        boolean[] visited=new boolean[V];
        while(!st.isEmpty())
        {
            int curr=st.pop();
            
            if(!visited[curr])
           {
                dfs(trans,curr,visited);
                count++;
           }
        }
        
        return count;
        
    }
    
     public static void dfs(List<List<Integer>>graph,int curr,boolean[] vis){
        
        vis[curr]=true;
        
        for(int i=0;i<graph.get(curr).size();i++)
        {
            int x=graph.get(curr).get(i);
            if(!vis[x])
            dfs(graph,x,vis);
        }
        
    }
    public static void toposort(List<List<Integer>>graph,int curr,boolean[] vis,Stack<Integer>st){
        
        vis[curr]=true;
        
        for(int i=0;i<graph.get(curr).size();i++)
        {
            int x=graph.get(curr).get(i);
            if(!vis[x])
            toposort(graph,x,vis,st);
        }
        
        st.push(curr);
        
    }
}