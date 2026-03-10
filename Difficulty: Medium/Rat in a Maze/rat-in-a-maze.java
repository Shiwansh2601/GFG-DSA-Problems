class Solution {
    ArrayList<String>res=new ArrayList<>();
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        
        boolean[][] vis=new boolean[maze.length][maze.length];
        dfs(0,0,maze,new StringBuilder(),vis);
        
        return res;
    }
    
    public void dfs(int i,int j,int[][] maze,StringBuilder str,boolean[][] vis)
    {
        int n=maze.length;
        
        if(i==n-1 &&j==n-1)
        {
            res.add(str.toString());
            return;
        }
        
        if(i<0||j<0||i>=n||j>=n ||maze[i][j]==0 ||vis[i][j])
        return;
        
        vis[i][j]=true;
        
        dfs(i+1,j,maze,str.append('D'),vis);
        str.deleteCharAt(str.length()-1);
        
        dfs(i,j-1,maze,str.append('L'),vis);
        str.deleteCharAt(str.length()-1);
        
        dfs(i,j+1,maze,str.append('R'),vis);
        str.deleteCharAt(str.length()-1);
        
        dfs(i-1,j,maze,str.append('U'),vis);
        str.deleteCharAt(str.length()-1);
        
        vis[i][j]=false;
    }
}