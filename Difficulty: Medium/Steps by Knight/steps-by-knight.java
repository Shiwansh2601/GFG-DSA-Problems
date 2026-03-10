class Solution {
    
    public boolean isValid(int i,int j,boolean[][] vis,int n){
        
        if(i<0||j<0||i>=n||j>=n||vis[i][j])
        return false;
        
        return true;
    }
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n) {
        // Code here
        
        int sx=knightPos[0]-1,sy=knightPos[1]-1;
        int tx=targetPos[0]-1,ty=targetPos[1]-1;
        
        boolean[][] vis=new boolean[n][n];
        
        Queue<int[]>q=new LinkedList<>();
        
        if(sx==tx && sy==ty)
        return 0;
        
        
        q.add(new int[]{sx,sy});
        vis[sx][sy]=true;
        
        int ans=0;
        
        while(!q.isEmpty())
        {
            
            ans++;
            int size=q.size();
            
           
            
            while(size>0)
            {
                
            int currx=q.peek()[0];
            int curry=q.peek()[1];
            q.poll();
            
            
                int[] dx={-2,-2,-1,1,2,2,1,-1};
                int[] dy={1,-1,-2,-2,-1,1,2,2};
                
                for(int i=0;i<8;i++)
                {
                    int nx=currx+dx[i];
                    int ny=curry+dy[i];
                    
                    if(nx==tx  && ny==ty) return ans;
                    
                    if(isValid(nx,ny,vis,n))
                    {
                        vis[nx][ny]=true;
                        q.add(new int[]{nx,ny});
                        
                    }
                }
                
                size--;
            }
            
        }
        
        return ans;
    }
}