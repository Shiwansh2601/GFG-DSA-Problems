// Complete this function!

class Geeks {
    public long count(int n) {
        // Add your code here.
        int[] arr={3,5,10};
        long[][] dp=new long[n+1][4];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        
        }
        return solve(n,arr,dp,0);
    }
    
    public long solve(int n,int[] arr,long[][] dp,int i) {
        
        if(n==0)
        return dp[n][i]=1;
        
        if(n<0 ||i==3)
        return 0;
        
        if(dp[n][i]!=-1)
        return dp[n][i];
        
        return dp[n][i]=solve(n-arr[i],arr,dp,i)+solve(n,arr,dp,i+1);
    }
}