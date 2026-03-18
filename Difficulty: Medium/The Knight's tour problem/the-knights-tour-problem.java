class Solution {
    static int[] dx={2,2,-2,-2,1,1,-1,-1};
    static int[] dy={1,-1,1,-1,2,-2,2,-2};
    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        // code here
        
        
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer>row=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                row.add(-1);
            }
            ans.add(row);
        }
        
        ans.get(0).set(0,0);
        
        if(solve(0,0,n,1,ans))
        return ans;
        
          ArrayList<ArrayList<Integer>>noans=new ArrayList<>();
      
        return noans;
        
        
        
    }
    public boolean isSafe(int i,int j,int n,ArrayList<ArrayList<Integer>>ans)
    {
        if(i<0||j<0||i>=n||j>=n ||ans.get(i).get(j)!=-1)
        return false;
        
        return true;
        
    }
    public boolean solve(int x,int y,int n,int step,ArrayList<ArrayList<Integer>>ans)
    {
        if(step==n*n)
        {
            return true;
        }
        
        for(int i=0;i<8;i++)
        {
            int nx=x+dx[i];
            int ny=y+dy[i];
            
            if(isSafe(nx,ny,n,ans))
            {
                ans.get(nx).set(ny,step);
                
                if(solve(nx,ny,n,step+1,ans))
                return true;
                
                
                ans.get(nx).set(ny,-1);
            }
        }
        
        return false;
    }
}