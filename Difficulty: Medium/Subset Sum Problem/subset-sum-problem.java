class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return solve(arr,arr.length,sum);
        
    }
    
    static Boolean solve(int arr[],int n, int sum) {
        // code here
        if(sum>0 && n==0)
        return false;
        
        if(sum==0)
        return true;
        
        if(arr[n-1]<=sum)
        return solve(arr,n-1,sum-arr[n-1]) ||solve(arr,n-1,sum);
        else
        return solve(arr,n-1,sum);
    }
}