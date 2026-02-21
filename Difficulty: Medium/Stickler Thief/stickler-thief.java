class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        
        return solve(0,dp,arr);
    }
    
    public int solve(int i,int[] dp,int[] arr){
        if(i>=arr.length){
            return 0;
        }
        
        if(dp[i]!=-1)
        return dp[i];
        
        int pick=arr[i]+solve(i+2,dp,arr);
        
        int nopick=solve(i+1,dp,arr);
        return dp[i]=Math.max(pick,nopick);
    }
}