/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        bfs(root,res,list);
        return res;
    }
    
    public void bfs(Node root,ArrayList<ArrayList<Integer>>res,ArrayList<Integer>list)
    {
        if(root==null)
        return;
        
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curr=q.remove();
            if(curr==null)
            {
                res.add(new ArrayList<>(list));
                list.clear();
                if(q.isEmpty())
                break;
                else
                {
                    q.add(null);
                }
            }
            else
            {
                list.add(curr.data);
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
        }
    }
}