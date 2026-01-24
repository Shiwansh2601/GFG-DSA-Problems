class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
         int total=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            total+=arr[i];
        }
       
        int sum=(diff+total);
        if(sum%2!=0 || diff>total)
        return 0;
        
         int[][] dp=new int[n+1][sum/2+1];
        
        
        dp[0][0]=1;
        
        
       return issubsetexist(arr,n,sum/2,dp);
        
        
    }
    
     public int issubsetexist(int[] arr,int n,int sum,int[][] dp)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-arr[i-1]]+dp[i-1][j];
                }
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}
