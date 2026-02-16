class Solution {
    public int findUnique(int[] arr) {
        // code here
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            res^=arr[i];
        }
        return res;
    }
}