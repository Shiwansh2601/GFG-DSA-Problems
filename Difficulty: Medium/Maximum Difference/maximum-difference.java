class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        Stack<Integer>ls=new Stack<>();
        Stack<Integer>rs=new Stack<>();
        int[] arr1=new int[arr.length];
        int[] arr2=new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            while(!ls.isEmpty() && arr[i]<=ls.peek())
            ls.pop();
            
            if(ls.isEmpty())
            arr1[i]=0;
            else
            arr1[i]=ls.peek();
            
            ls.push(arr[i]);
        }
        
         for(int i=arr.length-1;i>=0;i--)
        {
            while(!rs.isEmpty() && arr[i]<=rs.peek())
            rs.pop();
            
            if(rs.isEmpty())
            arr2[i]=0;
            else
            arr2[i]=rs.peek();
            
            rs.push(arr[i]);
        }
        
        int maxdiff=0;
        for(int i=0;i<arr.length;i++)
        {
            if(Math.abs(arr1[i]-arr2[i])>maxdiff)
            {
                maxdiff=Math.abs(arr1[i]-arr2[i]);
            }
        }
        
        return maxdiff;
    }
}