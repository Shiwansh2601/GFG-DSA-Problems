// User function Template for Java

class Solution {

    public int minDifference(int arr[]) {
        
        // Your code goes here
        int total=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            total+=arr[i];
        }
        boolean[][] dp=new boolean[n+1][total+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=total;j++)
            {
                if(j>0 && i==0)
                dp[i][j]=false;
                
                if(j==0)
                dp[i][j]=true;
            }
        }
        
        issubsetexist(arr,n,total,dp);
        
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<=total/2;i++)
        {
            if(dp[n][i])
            list.add(i);
        }
        
        int min=Integer.MAX_VALUE;
        for(int num:list)
        {
            min=Math.min(min,total-2*num);
        }
        
        return min;
    }
    
    public void issubsetexist(int[] arr,int n,int sum,boolean[][] dp)
    {
        for(int i=1;i<=n;i++)
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
