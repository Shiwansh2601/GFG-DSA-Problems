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
    public ArrayList<Integer> leftView(Node root) {
        // code here
         ArrayList<Integer>ans=new ArrayList<>();
        Set<Integer>set=new HashSet<>();

        solve(root,0,ans,set);

        return ans;
        
    }
    
    
     public void solve(Node root,int l,List<Integer>ans,Set<Integer>set)
    {
        if(root==null)
        return ;


        if(!set.contains(l))
        {
            ans.add(root.data);
            set.add(l);
        }
        
        solve(root.left,l+1,ans,set);
        solve(root.right,l+1,ans,set);
       


    }
}