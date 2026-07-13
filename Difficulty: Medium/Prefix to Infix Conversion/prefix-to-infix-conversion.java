class Solution {
    static String preToInfix(String exp) {
        // code here
        Stack<String>st=new Stack<>();
        
        int i=exp.length()-1;
        while(i>=0)
        {
            char ch=exp.charAt(i);
            if(ch=='+')
            {
                String s1=st.pop();
                String s2=st.pop();
                
                String str="("+s1+"+"+s2+")";
                st.push(str);
            }
            else if(ch=='-')
            {
                String s1=st.pop();
                String s2=st.pop();
                
                String str="("+s1+"-"+s2+")";
                st.push(str);
            }
            else if(ch=='*')
            {
                String s1=st.pop();
                String s2=st.pop();
                
                String str="("+s1+"*"+s2+")";
                st.push(str);
            }
            else if(ch=='/')
            {
                String s1=st.pop();
                String s2=st.pop();
                
                String str="("+s1+"/"+s2+")";
                st.push(str);
            }
            else if(ch=='^')
            {
                String s1=st.pop();
                String s2=st.pop();
                
                String str="("+s1+"^"+s2+")";
                st.push(str);
            }
            else 
            st.push(exp.substring(i,i+1));
            
            
            i--;
        }
        
        return st.pop();
    }
}
