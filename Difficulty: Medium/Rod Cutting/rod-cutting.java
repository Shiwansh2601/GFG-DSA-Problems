class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        
        return solve(0,n,price,dp);
        
    }
    
    public int solve(int i,int n,int[] arr,int[][] dp)
    {
        if(i==arr.length ||n<=0)
        return 0;
        
        if(dp[i][n]!=-1)
        return dp[i][n];
        
        int nontake=solve(i+1,n,arr,dp);
        int take=0;
        if(i+1<=n)
        {
            take=arr[i]+solve(i,n-(i+1),arr,dp);
        }
        
        return dp[i][n]=Math.max(take,nontake);
    }
}