// User function Template for Java

class Solution {

    public int minDifference(int arr[]) {
        // Your code goes here
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        boolean[][] dp=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(j==0)
                dp[i][j]=true;
            }
        }
        
        solve(sum,arr,dp);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=sum;i++)
        {
            if(dp[n][i])
            {
                int s1=i;
                int s2=sum-s1;
                min=Math.min(min,Math.abs(s2-s1));
                
            }
        }
        
        return min;
    }
    
    public void solve(int sum,int[] arr,boolean[][] dp)
    {
        for(int i=1;i<=arr.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
                }
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        
    }
}
