class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        return solve(arr);
        
    }
    static boolean solve(int[] arr)
    {
        int sum=0;
      for(int i=0;i<arr.length;i++)
      {
          sum+=arr[i];
      }
      
      if(sum%2!=0)
      return false;
      else
      return subsetsum(arr,arr.length,sum/2);
    }
    static boolean subsetsum(int arr[],int n, int sum) {
        // code here
        if(sum>0 && n==0)
        return false;
        
        if(sum==0)
        return true;
        
        if(arr[n-1]<=sum)
        return subsetsum(arr,n-1,sum-arr[n-1]) ||subsetsum(arr,n-1,sum);
        else
        return subsetsum(arr,n-1,sum);
    }
}