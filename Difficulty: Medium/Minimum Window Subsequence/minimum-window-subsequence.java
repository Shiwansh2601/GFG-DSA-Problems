class Solution {
    public String minWindow(String s1, String s2) {

        int n=s1.length();
        int m=s2.length();
        int j=0;
        int minlen=n+1;
        String minwin="";

        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                j++;
            }
            
            if(j==m)
            {

                int end=i+1;
                j--;

                int k=i;

                while(j>=0)
                {
                    if(s1.charAt(k)==s2.charAt(j))
                        j--;
                
                    k--;
                }

                k++;     
                j=0;   

                if(end-k<minlen)
                {
                    minlen=end-k;
                    minwin=s1.substring(k,end);
                }

                i=k;
            }
        }

        return minwin;
    }
}
