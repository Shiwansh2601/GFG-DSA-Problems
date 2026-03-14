/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
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
     
      solve(root.right,res);
       res.add(root.data);
  }
    
    
}