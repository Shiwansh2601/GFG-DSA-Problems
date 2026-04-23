class Solution {
    public int minFallingPathSum(int[][] mat) {
        // code here
        int n=mat.length;
        
        int[][] dp=new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,solve(0,i,mat,dp));
        }
        
        return min;
    }
    
    public int solve(int i,int j,int[][] mat,int[][] dp)
    {
        int n=mat.length;
        if(j<0 ||i>=n ||j>=n)return Integer.MAX_VALUE;;
        
        if(i==n-1)
        return mat[i][j];
        
        if(dp[i][j]!=-1)
        return dp[i][j];
        
        int down=solve(i+1,j,mat,dp);
        int dl=solve(i+1,j-1,mat,dp);
        int dr=solve(i+1,j+1,mat,dp);
        
        return dp[i][j]=mat[i][j]+Math.min(down,Math.min(dl,dr));
    }
}
