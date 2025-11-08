class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        Stack<Integer>stk=new Stack<>();
        
        for(int i=0;i<arr.length;i++)
        {
            
            while(!stk.isEmpty() && arr[i]<=stk.peek())
              stk.pop();
            
            if(stk.isEmpty())
            res.add(-1);
            else
            res.add(stk.peek());
            
            stk.push(arr[i]);
        }
        
        
        
        return res;
    }
}