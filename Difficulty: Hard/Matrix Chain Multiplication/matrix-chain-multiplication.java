class Solution {
    static int matrixMultiplication(int arr[]) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(1,arr.length-1,arr,dp);
    }
    
    static int solve(int i,int j,int[] arr,int[][] dp)
    {
        if(i==j)
        return 0;
        
        
        if(dp[i][j]!=-1)
        return dp[i][j];
        
        int min=Integer.MAX_VALUE;
        
        for(int k=i;k<j;k++)
        {
            int step=arr[i-1]*arr[k]*arr[j];
            
            min=Math.min(min,step+solve(i,k,arr,dp)+solve(k+1,j,arr,dp));
        }
        
        return dp[i][j]=min;
    }
}