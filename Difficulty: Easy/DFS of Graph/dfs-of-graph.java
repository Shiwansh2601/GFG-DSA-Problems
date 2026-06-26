class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n=adj.size();
        boolean[] vis=new boolean[n];
        ArrayList<Integer>ans=new ArrayList<>();
        solve(adj,ans,0,vis);
        
        return ans;
    }
    
    public void solve(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>ans,int curr,boolean[] vis){
        ans.add(curr);
        vis[curr]=true;
        for(int x:adj.get(curr))
        {
            
            if(!vis[x])
            solve(adj,ans,x,vis);
        }
    }
}