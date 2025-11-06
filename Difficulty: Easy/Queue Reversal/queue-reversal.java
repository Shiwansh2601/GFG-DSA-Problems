class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer>stk=new Stack<>();
        while(!q.isEmpty())
        {
            stk.push(q.remove());
        }
        
        
         while(!stk.isEmpty())
        {
            q.add(stk.pop());
        }
        
    }
}