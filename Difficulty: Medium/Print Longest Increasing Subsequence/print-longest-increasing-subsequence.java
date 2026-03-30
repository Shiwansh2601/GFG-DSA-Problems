class Solution {
    public ArrayList<Integer> getLIS(int arr[]) {
        // Code here
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int[] hash=new int[n];
        for(int i=0;i<n;i++)
        {
            hash[i]=-1;
        }
        
    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]<arr[i] && dp[j]+1>dp[i])
                {
                    
                  dp[i]=dp[j]+1;
                  hash[i]=j;
                }
            }
        }
        
        int max=0;
        int indx=0;
        for(int i=0;i<n;i++)
        {
            if(dp[i]>max)
            {
                indx=i;
                max=dp[i];
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(indx!=-1)
        {
            ans.add(arr[indx]);
            indx=hash[indx];
        }
        
        Collections.sort(ans);
        return ans;
        
    }
}
