class Solution {
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n=val.length;
        int[][] dp=new int[n+1][capacity+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=capacity;j++)
            {
                if(i==0||j==0)
                dp[i][j]=0;
            }
        }
        return tabulation(val,wt,n,capacity,dp);
    }
    
    public int tabulation(int[] val,int[] wt,int n,int capacity,int[][] dp)
    {
         for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=capacity;j++)
            {
                if(wt[i-1]<=j)
                {
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][capacity];
    }
}