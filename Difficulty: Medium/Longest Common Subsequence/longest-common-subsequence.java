class Solution {
    static int lcs(String s1, String s2) {
        // code here
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        
        return solve(s1.length(),s2.length(),s1,s2,dp);
    }
    
    static int solve(int n,int m,String s1,String s2,int[][] dp)
    {

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        return dp[n][m];
    }
}