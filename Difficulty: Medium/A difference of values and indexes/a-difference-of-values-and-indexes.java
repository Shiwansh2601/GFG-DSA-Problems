// User function Template for Java

class Solution {

    // Function for finding maximum and value pair
    public static int maxDistance(int arr[], int n) {
        // Complete the function
        
        int max1=-1000001;
        int min1=1000001;
        int max2=-1000001;
        int min2=1000001;
        
        
        for(int i=0;i<n;i++)
        {
            int x=arr[i]+i;
            int y=arr[i]-i;
            
            max1=Math.max(max1,x);
            min1=Math.min(min1,x);
            
            max2=Math.max(max2,y);
            min2=Math.min(min2,y);
        }
        
        
        return Math.max(max1-min1,max2-min2);
    }
}
