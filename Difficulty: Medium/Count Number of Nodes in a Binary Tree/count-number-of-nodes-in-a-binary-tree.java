// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        // Code here
        if(root==null)
        {
            return 0;
        }

       int lh=lefth(root.left);
       int rh=righth(root.right);
       
       if(lh==rh)
       {
           return (int)Math.pow(2,lh+1)-1;
       }
       else
       {
           int lc=countNodes(root.left);
           int rc=countNodes(root.right);
           
           return lc+rc+1;
       }
    }
    
    
    public static int lefth(Node root)
    {
        if(root==null)
        return 0;
        
        return lefth(root.left)+1;
    }
    
    public static int righth(Node root)
    {
        if(root==null)
        return 0;
        
        return righth(root.right)+1;
    }
}