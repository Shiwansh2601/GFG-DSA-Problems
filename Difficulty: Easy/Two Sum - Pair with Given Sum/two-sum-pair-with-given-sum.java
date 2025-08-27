class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==target)
            return true;
            
            if(arr[i]+arr[j]<target)
            i++;
            else
            j--;
        }
        
        return false;
    }
}