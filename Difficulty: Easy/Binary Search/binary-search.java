class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int s=0;
        int e=arr.length-1;
        int res=-1;
        while(s<=e)
        {
            
            int mid=(s+e)/2;
            
            if(arr[mid]==k)
            {
            res=mid;
            e=mid-1;
            }
            else if(arr[mid]<k)
            s=mid+1;
            else
            e=mid-1;
        }
        return res;
    }
}