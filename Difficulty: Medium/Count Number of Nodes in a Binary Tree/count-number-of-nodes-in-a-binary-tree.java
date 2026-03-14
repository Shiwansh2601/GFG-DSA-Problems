// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        // Code here
        if(root==null)
        {
            return 0;
        }

        int x=countNodes(root.left);
        int y=countNodes(root.right);
        return x+y+1;
    }
}