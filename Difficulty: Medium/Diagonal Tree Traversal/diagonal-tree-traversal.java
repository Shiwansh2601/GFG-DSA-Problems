/* Node is defined as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/


class Tree {
    public ArrayList<Integer> diagonal(Node root) {
        // add your code here.
        ArrayList<Integer>ans=new ArrayList<>();
       
        Queue<Node>que=new LinkedList<>();
        que.offer(root);
        
        while(!que.isEmpty())
        {
            Node curr=que.poll();
           while(curr!=null)
           {
              
               ans.add(curr.data);
            
            if(curr.left!=null)
            {
                que.offer(curr.left);
            }
            
            
            curr=curr.right;
           }
            
            
        }
        
        
        
        return ans;
        
    }
}