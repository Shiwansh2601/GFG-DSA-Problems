class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=-1;
        int secondlr=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        
         for(int i=0;i<arr.length;i++)
        {
            if(secondlr<arr[i] && arr[i]!=largest)
            {
                secondlr=arr[i];
            }
        }
        return secondlr;
    }
}