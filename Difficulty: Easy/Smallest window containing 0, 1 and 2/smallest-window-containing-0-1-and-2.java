// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        HashMap<Character,Integer>map=new HashMap<>();
        int start=0;
        int res=Integer.MAX_VALUE;
        int cnt=0;
        for(int i=0;i<S.length();i++)
        {
            char c=S.charAt(i);
             map.put(c,map.getOrDefault(c,0)+1);
             
                while(map.size()==3)
                {
                    res=Math.min(res,i-start+1);
                   char left=S.charAt(start);
                   map.put(left,map.get(left)-1);
                   if(map.get(left)==0)
                   map.remove(left);
                   start++;
                }
           
        }
        
        return res==Integer.MAX_VALUE?-1:res;
    }
};
