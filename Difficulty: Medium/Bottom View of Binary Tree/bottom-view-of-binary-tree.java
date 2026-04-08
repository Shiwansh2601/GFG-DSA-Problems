/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    static int min=0;
    static int max=0;
    
    class Pair{
        
        int x;
        Node node;
        
        Pair(int x,Node n)
        {
            this.x=x;
            node=n;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        min=0;
        max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        
        solve(root,map);
        
        for(int i=min;i<=max;i++)
        {
            ans.add(map.get(i));
        }
        
        return ans;
        
    }
    
    public void solve(Node root,HashMap<Integer,Integer>map)
    {
        
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(0,root));
        
        
        
       while(!q.isEmpty())
       {
           Pair curr=q.poll();
           
           int x=curr.x;
           
           Node temp=curr.node;
           int d=temp.data;
           min=Math.min(min,x);
           max=Math.max(max,x);
           
          
           map.put(x,d);
           
           if(temp.left!=null)
           q.add(new Pair(x-1,temp.left));
           
           if(temp.right!=null)
           q.add(new Pair(x+1,temp.right));
           
           
       }
        
       
        
    }
}