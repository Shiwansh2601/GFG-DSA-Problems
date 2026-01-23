class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
       
        int[][] dp=new int[nums.length+1][target+1];
        for(int i=0;i<=nums.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        
        return solve(nums,nums.length,target,dp);
    }
    
     public int solve(int[] nums,int n, int target,int[][] dp) {
        // code here
         
        if (n == 0)
           return target == 0 ? 1 : 0;

        if(dp[n][target]!=-1)
         return dp[n][target];
        
        if(nums[n-1]<=target)
        {
            dp[n][target]=solve(nums,n-1,target-nums[n-1],dp)+solve(nums,n-1,target,dp);
        }
        else
         dp[n][target]=solve(nums,n-1,target,dp);
         
         
         return dp[n][target];
    }
}