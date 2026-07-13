class Solution {
    public static String infixToPostfix(String s) {
        // code here
        String ans="";
        Stack<Character>st=new Stack<>();
        int i=0;
        
        while(i<s.length())
        {
            char ch=s.charAt(i);
            
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')|| (ch>='0' && ch<='9'))
            {
               ans=ans+ch;
                
            }
            else if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
                while(!st.isEmpty() && st.peek()!='(')
                {
                    ans+=st.pop();
                }
                
                st.pop();
            }
            else 
            {
                while(!st.isEmpty() && priority(st.peek())>=priority(ch) && ch!='^')
                {
                    ans=ans+st.pop();
                }
                
                st.push(ch);
            }
            
            i++;
            
        }
        
        while(!st.isEmpty())
        ans=ans+st.pop();
        
        
        return ans;
    }
    
    public static int priority(char ch)
    {
        if(ch=='+' || ch=='-')
        return 1;
        else if(ch=='*' || ch=='/')
        return 2;
        else if(ch=='^')
        return 3;
        else 
        return -1;
        
    }
}