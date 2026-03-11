// User function Template for Java

class Solution {
    // Function to return a list of lists of integers denoting the members
    // of strongly connected components in the given graph.
    public ArrayList<ArrayList<Integer>> tarjans(int V,
                                                 ArrayList<ArrayList<Integer>> adj) {
        // code here
        
       
        
        boolean[] vis=new boolean[V];
        Stack<Integer>st=new Stack<>();
        // Step 1 Toposort
        
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                toposort(adj,i,vis,st);
            }
        }
        
        
        //Step 2 Transpose of graph
        
        ArrayList<ArrayList<Integer>>trans=new ArrayList<>();
         for(int i=0;i<V;i++)
        {
            trans.add(new ArrayList<>());
            
        }
        
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                int v=adj.get(i).get(j);
                trans.get(v).add(i);
            }
        }
        
        // step 3 DFS
        
        boolean[] visited=new boolean[V];
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        while(!st.isEmpty())
        {
            int curr=st.pop();
            
            if(!visited[curr])
           {
                ArrayList<Integer>list=new ArrayList<>();
                dfs(trans,curr,visited,list);
                Collections.sort(list);
                ans.add(list);
                
           }
        }
        
        Collections.sort(ans,(a,b)->{
            int n=Math.min(a.size(),b.size());
            for(int i=0;i<n;i++)
            {
                if(a.get(i)!=b.get(i))
                return a.get(i)-b.get(i);
            }
            
            return a.size()-b.size();
        });
        return ans;
    }
    
     public static void dfs(ArrayList<ArrayList<Integer>>graph,int curr,boolean[] vis,ArrayList<Integer>list){
        
        vis[curr]=true;
        list.add(curr);
        
        for(int i=0;i<graph.get(curr).size();i++)
        {
            int x=graph.get(curr).get(i);
            if(!vis[x])
            dfs(graph,x,vis,list);
        }
        
    }
    public static void toposort(ArrayList<ArrayList<Integer>>graph,int curr,boolean[] vis,Stack<Integer>st){
        
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