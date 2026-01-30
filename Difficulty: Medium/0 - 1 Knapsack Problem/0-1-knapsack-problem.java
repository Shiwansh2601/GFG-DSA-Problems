class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=val.length;
        int[][] dp=new int[n+1][W+1];
        for(int i=0;i<=n;i++)
        {
             Arrays.fill(dp[i],-1);
        }
        
       
        return solve(n,W,val,wt,dp);
    }
    public int solve(int n,int cap,int[] val,int[] wt,int[][] dp){
        //base case
        
        if(n==0 ||cap==0)
        return 0;
        
        if(dp[n][cap]!=-1)
        return dp[n][cap];
                                              
        //main code
        
        if(wt[n-1]<=cap)
        {
            return dp[n][cap]=Math.max(val[n-1]+solve(n-1,cap-wt[n-1],val,wt,dp),solve(n-1,cap,val,wt,dp));
        }
        else
        {
            return dp[n][cap]=solve(n-1,cap,val,wt,dp);
        }
    }
}
