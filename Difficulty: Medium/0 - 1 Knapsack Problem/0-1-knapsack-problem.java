class Solution {
    
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int[][] dp=new int[1001][1001];
   
        return solve(W,val,wt,wt.length,dp);
        
        
    }
    
     public int solve(int W, int val[], int wt[],int n,int[][] dp) {
        // code here
        for(int i=1;i<=wt.length;i++)
        {
            for(int j=1;j<=W;j++)
            {
                
              if(wt[i-1]<=j)
             {
                 dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
             }
            else
           {
             dp[i][j]=dp[i-1][j];
           }
           
            }
        }
        
         return dp[wt.length][W];
        
        
    }
}
