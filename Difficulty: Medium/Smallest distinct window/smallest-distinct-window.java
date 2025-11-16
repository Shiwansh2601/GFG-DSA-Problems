// User function Template for Java

class Solution {
    public int findSubString(String str) {
        // code here
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            set.add(str.charAt(i));
        }
        
        int reqsize=set.size();
        int min=Integer.MAX_VALUE;
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        while(j<str.length())
        {
            char ch=str.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
                while(map.size()==reqsize)
                {   
                    min=Math.min(min,j-i+1);
                    char p=str.charAt(i);
                    map.put(p,map.getOrDefault(p,0)-1);
                    
                    if(map.get(p)==0)
                    map.remove(p);
                    
                    i++;
                }
        
                j++;
        }
        return min;
    }
}