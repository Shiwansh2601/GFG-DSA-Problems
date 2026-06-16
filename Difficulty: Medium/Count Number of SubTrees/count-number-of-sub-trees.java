/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class Solution {
    int count=0;
    int countSubtrees(Node root, int x) {
        //  code here.
        
        helper(root,x);
        return count;
        
    }
    
    int helper(Node root,int x)
    {
        
        if(root==null) return 0;
        
        int ls=helper(root.left,x);
        int rs=helper(root.right,x);
        
        if(ls+rs+root.data==x)
        count++;
        
        return ls+rs+root.data;
    }
}