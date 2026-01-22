class Solution {
    
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int[][] dp=new int[1001][1001];
    for(int i=0;i<=1000;i++)
    {
        Arrays.fill(dp[i],-1);
    }
        return solve(W,val,wt,wt.length,dp);
        
    }
    
     public int solve(int W, int val[], int wt[],int n,int[][] dp) {
        // code here
        if(n==0||W==0)
        return 0;
        
        if(dp[n][W]!=-1)
        return dp[n][W];
        
        if(wt[n-1]<=W)
        {
            return dp[n][W]=Math.max(val[n-1]+solve(W-wt[n-1],val,wt,n-1,dp),solve(W,val,wt,n-1,dp));
        }
        else
        {
            return dp[n][W]=solve(W,val,wt,n-1,dp);
        }
    }
}
