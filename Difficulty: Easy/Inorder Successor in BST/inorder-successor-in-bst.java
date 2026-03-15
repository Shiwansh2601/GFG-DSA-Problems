/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution {
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public int inorderSuccessor(Node root, Node x) {
        // add code here.
    
      int succ=-1;
      Node curr=root;
      while(curr!=null)
      {
          if(curr.data>x.data)
          {   succ=curr.data;
              curr=curr.left;
          }
          else if(curr.data<x.data)
          {
              curr=curr.right;
          }
          else
          {
                if(curr.right!=null)
               {
                  Node temp = curr.right;
                  while (temp.left != null) {
                  temp = temp.left;
                  }
                 return temp.data;
               }
               
               break;
              
          }
          
          
      }
      
      
      
      return succ;
      
        
        
    }
    

    
   
}