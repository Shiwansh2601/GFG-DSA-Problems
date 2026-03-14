/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    // Function to return sum of all nodes of a binary tree
    static int sumBT(Node root) {
        // Your code here
        if(root==null)
        {
            return 0;
        }

        int x=sumBT(root.left);
        int y=sumBT(root.right);
        return x+y+root.data;
    }
}