class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        Stack<Integer>stk=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--)
        {
            
            while(!stk.isEmpty() && arr[i]<=stk.peek())
              stk.pop();
            
            if(stk.isEmpty())
            res.add(-1);
            else
            res.add(stk.peek());
            
            stk.push(arr[i]);
        }
        
        Collections.reverse(res);
        
        return res;
    }
}