class Solution {
    public int numberOfPaths(int m, int n) {
        // code here
        int[][] mat=new int[m][n];
        
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(mat,dp,m,n,0,0);
        
    }
    
    public int solve(int[][] mat,int[][] dp,int m,int n,int i,int j)
    {
        if(i==m-1 && j==n-1)
        {
            return 1;
        }
        
        if(i<0 ||i>=m  ||j<0 || j>=n)
        {
            return 0;
        }
        
       if(dp[i][j]!=-1)
       return dp[i][j];
       
       
        
        int down=solve(mat,dp,m,n,i+1,j);
        int right=solve(mat,dp,m,n,i,j+1);
        
        return dp[i][j]=down+right;
    }
}