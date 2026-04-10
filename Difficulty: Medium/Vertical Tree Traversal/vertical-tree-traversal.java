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
    
    class Pair
    {
        Node node;
        int val;
        
        Pair(Node n,int d)
        {
            node=n;
            val=d;
    
        }
    }
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        min=0;
        max=0;
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
        solve(root,map);
        
        for(int i=min;i<=max;i++)
        {
            ans.add(map.get(i));
        }
        
        return ans;
        
    }
    
    public void solve(Node root,HashMap<Integer,ArrayList<Integer>>map)
    {
      Queue<Pair>q=new LinkedList<>();
      q.add(new Pair(root,0));
      
      
      while(!q.isEmpty())
      {
          Pair curr=q.poll();
          
          Node temp=curr.node;
          int x=curr.val;
          int d=temp.data;
          
          
          min=Math.min(min,x);
          max=Math.max(max,x);
          
          if(map.containsKey(x))
          {
              map.get(x).add(d);
          }
          else
          {
              map.put(x,new ArrayList<>());
              map.get(x).add(d);
              
          }
          
          
          if(temp.left!=null)
          q.add(new Pair(temp.left,x-1));
           
           
          if(temp.right!=null)
          q.add(new Pair(temp.right,x+1));
          
      }
      
      
        
    }
}