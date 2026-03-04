class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        int n=adj.size();
        boolean[] vis=new boolean[n];
        q.add(0);
        while(q.size()>0)
        {
            int curr=q.remove();
            
            if(!vis[curr])
            {
                ans.add(curr);
                vis[curr]=true;
                
                for(int i=0;i<adj.get(curr).size();i++)
                {
                    q.add(adj.get(curr).get(i));
                }
            }
        }
        
        return ans;
    }
}