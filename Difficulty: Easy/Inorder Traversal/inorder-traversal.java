/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
   
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        solve(root,res);
        return res;
    }
    
    public static void solve(Node root,ArrayList<Integer>res)
  {   
    if(root==null)
      return;
      
      solve(root.left,res);
      res.add(root.data);
      solve(root.right,res);
  }
}