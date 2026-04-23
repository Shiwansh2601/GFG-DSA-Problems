class Solution {
    public int longCommSubstr(String s1, String s2) {
        // code here
        int[][] dp=new int[s1.length()][s2.length()];
        
        for(int i=0;i<s1.length();i++)
        {
            Arrays.fill(dp[i],-1);
        }
        
      
        
        int max=0;
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                max=Math.max(max,solve(i,j,s1,s2,dp));
            }
        }
        
        return max;
    }
    
    
    public int solve(int i,int j,String s1,String s2,int[][] dp)
    {
        if(i==s1.length() ||j==s2.length())
        return 0;
        
        if(dp[i][j]!=-1)
        return dp[i][j];
        
        if(s1.charAt(i)==s2.charAt(j))
        {
            return dp[i][j]=1+solve(i+1,j+1,s1,s2,dp);
        }
        else 
        {
            return dp[i][j]=0;
        }
    }
}