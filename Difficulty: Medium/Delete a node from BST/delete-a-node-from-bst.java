/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node delNode(Node root, int x) {
        // code here
        if(root==null)
        return null;
        
        if(x<root.data)
        root.left=delNode(root.left,x);
        else if(x>root.data)
        root.right= delNode(root.right,x);
        else
        {
            //case 1
            if(root.left==null && root.right==null)
            return null;
            
            //case 2;
            
            if(root.left==null)
            return root.right;
            else if(root.right==null)
            return root.left;
            
            //case 3
            else
            {
                Node Is=find(root.right);
                root.data=Is.data;
                root.right= delNode(root.right,Is.data);
            }
        }
        
        return root;
    }
    public Node find(Node root)
    {
        while(root.left!=null)
        root=root.left;
        
        return root;
    }
}