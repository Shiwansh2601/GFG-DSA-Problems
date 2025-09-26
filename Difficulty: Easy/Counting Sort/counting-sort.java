class Solution {
    public static String countSort(String s) {
        // code here
        int n=s.length();
        
        char max=s.charAt(0);
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)-'a'>max-'a')
            max=s.charAt(i);
            
        }
        int m=max-'a';
        int [] count=new int[m+1];
        for(int i=0;i<=m;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            count[s.charAt(i)-'a']++;
        }
        for(int i=1;i<=m;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        char[] res=new char[n];
        for(int i=n-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            res[count[ch-'a']-1]=ch;
            count[ch-'a']--;
            
        }
        
        String output="";
        for(int i=0;i<n;i++)
        {
            output=output+res[i];
        }
        return output;
    }
}