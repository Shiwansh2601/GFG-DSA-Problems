class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int[] len=new int[n];
        for(int i=0;i<n;i++)
        {
            len[i]=i+1;
        }
        int l=n;
        int[][] dp=new int[n+1][n+1];
       return solve(n,l,price,len,dp);
       
    }
    
    
    public int solve(int n,int l,int[] price,int[] len,int[][] dp)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=l;j++)
            {
                if(len[i-1]<=j)
                {
                    dp[i][j]=Math.max(dp[i][j-len[i-1]]+price[i-1],dp[i-1][j]);
                }
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][l];
    }
}