class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        if(arr.length==1)
        return true;
        
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            return false;
            
        }
        
        return true;
    }
}