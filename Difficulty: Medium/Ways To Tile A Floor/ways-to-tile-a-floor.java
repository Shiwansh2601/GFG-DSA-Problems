class Solution {
    public int numberOfWays(int n) {
        // code here
        
        int[] dp=new int[n+1];
        
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    
    public int solve(int n,int[] dp)
    {
        if(n==1||n==2)return n;
        
        if(dp[n]!=-1)return dp[n];
        
        return dp[n]=solve(n-1,dp)+solve(n-2,dp);
    }
}