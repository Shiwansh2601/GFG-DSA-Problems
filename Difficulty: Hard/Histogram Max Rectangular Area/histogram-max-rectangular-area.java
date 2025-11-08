class Solution {
    public static int[] findnextsmaller(int[] arr)
    {
        int[] res=new int[arr.length];
         Stack<Integer>stk=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--)
        {
            
            while(!stk.isEmpty() && arr[i]<=arr[stk.peek()])
              stk.pop();
            
            if(stk.isEmpty())
            res[i]=-1;
            else
            res[i]=stk.peek();
            
            stk.push(i);
            
        }
        
        return res;
    }
    
     public static int[] findprevsmaller(int[] arr)
    {
         int[] res=new int[arr.length];
         Stack<Integer>stk=new Stack<>();
        
        for(int i=0;i<arr.length;i++)
        {
            
            while(!stk.isEmpty() && arr[i]<=arr[stk.peek()])
              stk.pop();
            
            if(stk.isEmpty())
            res[i]=-1;
            else
            res[i]=stk.peek();
            
            stk.push(i);
        }
        
        return res;
    }
    
    public static int getMaxArea(int arr[]) {
        // code here
        int n=arr.length;
        int[] indxofnext=findnextsmaller(arr);
        int maxarea=Integer.MIN_VALUE;
        int[] indxofprev=findprevsmaller(arr);
        for(int i=0;i<n;i++)
        {
           int l=arr[i];
           if(indxofnext[i]==-1)
           indxofnext[i]=n;
           
           int b=indxofnext[i]-indxofprev[i]-1;
           int area=l*b;
           maxarea=Math.max(area,maxarea);
        }
        
        return maxarea;
    }
}
