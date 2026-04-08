/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(root.data);
        
        if(root.left==null && root.right==null)
        return ans;
        
        
        left(root.left,ans);
        leaf(root,ans);
        Stack<Integer>st=new Stack<>();
        right(root.right,st);
        
        
        while(st.size()>0)
        {
            ans.add(st.pop());
        }
        return ans;
    }
    
    void left(Node root,ArrayList<Integer>ans)
    {
        if(root==null ||(root.left==null && root.right==null))
        return;
        
        ans.add(root.data);
        
        if(root.left!=null)
        left(root.left,ans);
        else if(root.right!=null)
        left(root.right,ans);
        
        
    }
    
     void right(Node root,Stack<Integer>st)
    {
        if(root==null||(root.left==null && root.right==null))
        return;
        
        st.push(root.data);
        
        if(root.right!=null)
        right(root.right,st);
        else if(root.left!=null)
        right(root.left,st);
        
    }
    
    void leaf(Node root,ArrayList<Integer>ans)
    {
        
        
        if(root.left==null && root.right==null)
        {
            ans.add(root.data);
            return;
        }
        
       if(root.left!=null)
        leaf(root.left,ans);
        
        if(root.right!=null)
        leaf(root.right,ans);
    }
}