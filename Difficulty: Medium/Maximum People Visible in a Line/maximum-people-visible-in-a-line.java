class Solution {
    public int maxPeople(int[] arr) {
        // code here
        int n=arr.length;
        int[] next=new int[n];
        int[] prev=new int[n];
        
        Stack<Integer>st=new Stack<>();
        
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]<arr[i])
            {
                st.pop();
            }
            
            if(st.isEmpty())
            next[i]=n;
            else
            next[i]=st.peek();
            
            st.push(i);
        }
        
        st.clear();
        
         for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]<arr[i])
            {
                st.pop();
            }
            
            if(st.isEmpty())
            prev[i]=-1;
            else
            prev[i]=st.peek();
            
            st.push(i);
        }
        
        int max=0;
        for(int i=0;i<n;i++)
        {
             int leftBound = (prev[i] == -1 ? 0 : prev[i] + 1);
            int rightBound = (next[i] == n ? n - 1 : next[i] - 1);
            
            int curr=rightBound-leftBound+1;
            
            
            max=Math.max(max,curr);
        }
        
        return max;
    }
}
