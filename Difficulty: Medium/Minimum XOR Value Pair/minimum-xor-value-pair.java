class Solution {
    public int minXor(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        int res=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            res=Math.min(res,arr[i]^arr[i-1]);
        }
        
        return res;
    }
}