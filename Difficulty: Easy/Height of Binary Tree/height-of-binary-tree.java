/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        
         if(root==null)
        return 0;
        
        
        return solve(root)-1;
        
    }
    
    public int solve(Node root)
    {
        if(root==null)
        return 0;

        return Math.max(solve(root.left),solve(root.right))+1;
    }
}