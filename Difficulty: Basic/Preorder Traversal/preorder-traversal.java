/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer>res=new ArrayList<>();
        solve(root,res);
        return res;
        
    }
      public static void solve(Node root,ArrayList<Integer>res)
  {   
    if(root==null)
      return;
      
      res.add(root.data);
      solve(root.left,res);
   
      solve(root.right,res);
  }
}