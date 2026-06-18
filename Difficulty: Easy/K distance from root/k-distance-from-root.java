/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
class Pair{
    
    Node node;
    int hd;
    Pair(Node n,int h)
    {
        node =n;
        hd=h;
    }
}
class Solution {
    
    ArrayList<Integer>ans=new ArrayList<>();
    public ArrayList<Integer> Kdistance(Node root, int k) {
        // code here
        solve(root,k);
        return ans;
        
    }
    
    public void solve(Node root,int k){
        
        if(k<0 || root ==null)return;
        
        if(k==0)
        {
            ans.add(root.data);
        }
        
        solve(root.left,k-1);
        solve(root.right,k-1);
    }
};