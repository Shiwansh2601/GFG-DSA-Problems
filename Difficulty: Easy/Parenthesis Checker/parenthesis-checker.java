class Solution {
    public boolean isBalanced(String s) {
        
        
        
         Stack<Character>charstack=new Stack<>();
         
        for(char ch:s.toCharArray())
        {
            if(ch=='('||ch=='{'||ch=='[')
            {
                charstack.push(ch);
            }
            else
            {
                if(charstack.isEmpty())
                return false;
                
                 char last=charstack.peek();
                if((ch==')' && last=='(')||(ch=='}' && last=='{')||(ch==']' && last=='['))
                {
                      charstack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return charstack.isEmpty();
    }
}
