class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String>st=new Stack<>();
        
        int i=0;
        while(i<exp.length())
        {
            char ch=exp.charAt(i);
            if(ch=='+')
            {
                String s1=st.pop();
                String s2=st.pop();
                
                String str="("+s2+"+"+s1+")";
                st.push(str);
            }
            else if(ch=='-')
            {
                String s1=st.pop();
                String s2=st.pop();
                
                String str="("+s2+"-"+s1+")";
                st.push(str);
            }
            else if(ch=='*')
            {
                String s1=st.pop();
                String s2=st.pop();
                
                String str="("+s2+"*"+s1+")";
                st.push(str);
            }
            else if(ch=='/')
            {
                String s1=st.pop();
                String s2=st.pop();
                
                String str="("+s2+"/"+s1+")";
                st.push(str);
            }
            else if(ch=='^')
            {
                String s1=st.pop();
                String s2=st.pop();
                
                String str="("+s2+"^"+s1+")";
                st.push(str);
            }
            else 
            st.push(exp.substring(i,i+1));
            
            
            i++;
        }
        
        return st.pop();
    }
}
