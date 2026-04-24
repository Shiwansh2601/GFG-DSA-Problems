// User function Template for Java

class Solution {
    // Function to return the total number of possible unique BST.
    static int numTrees(int n) {
        // Your code goes here
        
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        
        return solve(n,dp);
    }
    
    static int solve(int n,int[] dp)
    {
        if(n<=1)
        return 1;
        
        if(dp[n]!=-1)return dp[n];
        
        int res=0;
        for(int k=0;k<n;k++)
        {
            res+=solve(k,dp)*solve(n-k-1,dp);
        }
        
        return dp[n]=res;
    }
}
