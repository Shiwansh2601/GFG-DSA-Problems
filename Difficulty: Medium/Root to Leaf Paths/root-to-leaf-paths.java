/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
   
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        solve(root,new ArrayList<>(),ans);
        return ans;
        
    }
    
    public static void solve(Node root,ArrayList<Integer>list,ArrayList<ArrayList<Integer>> ans)
    {
        if(root==null)
        return;

        if(root.left==null && root.right==null)
        {
            list.add(root.data);
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        
        list.add(root.data);
        solve(root.left,list,ans);
        solve(root.right,list,ans);
        list.remove(list.size()-1);


    }
}