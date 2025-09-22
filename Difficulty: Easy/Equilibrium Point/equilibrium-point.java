class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
          int[] presum=new int[arr.length];
        int[] postsum=new int[arr.length];
        presum[0]=arr[0];
        postsum[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++)
        {
            presum[i]=presum[i-1]+arr[i];
        }

        for(int i=arr.length-2;i>=0;i--)
        {
            postsum[i]=postsum[i+1]+arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            if(presum[i]==postsum[i])
            return i;
        }

        return -1;
    }
}
