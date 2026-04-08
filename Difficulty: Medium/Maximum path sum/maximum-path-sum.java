/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    static int ans;
    int findMaxSum(Node root) {
        // code here
        ans=Integer.MIN_VALUE;
        solve(root);
        return ans;
        
    }
    
    int solve(Node root)
    {
        if(root==null)
        return 0;
        
        int lp=Math.max(0,solve(root.left));
        int rp=Math.max(0,solve(root.right));
        
        ans=Math.max(ans,lp+rp+root.data);
        
        return Math.max(lp,rp)+root.data;
    
    }
}