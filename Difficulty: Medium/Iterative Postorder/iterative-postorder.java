// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Pair{
    
    Node node;
    int time;
    
    Pair(Node n,int t){
        node=n;
        time=t;
    }
}
class Tree {
    ArrayList<Integer> postOrder(Node root) {
        // code here
         ArrayList<Integer>list=new ArrayList<>();
         Stack<Pair>st=new Stack<>();
         
         st.push(new Pair(root,1));
         
         while(!st.isEmpty())
         {
             Pair curr=st.peek();
             Node node=curr.node;
             int time=curr.time;
             if(time==1)
             {
                 
                 st.peek().time++;
                 if(node.left!=null)
                 st.push(new Pair(node.left,1));
             }
             else if(time ==2)
             {
                
                 st.peek().time++;
                 if(node.right!=null)
                 st.push(new Pair(node.right,1));
             }
             else {
                 
                 list.add(node.data);
                 st.pop();
                
             }
         }
        
        
        return list;
    }
}