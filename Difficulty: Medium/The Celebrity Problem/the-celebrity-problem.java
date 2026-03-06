class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        int[] indegree=new int[n];
        int[] outdegree=new int[n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==1)
                {
                    indegree[j]++;
                    outdegree[i]++;
                }
            
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==n&& outdegree[i]==1)
            return i;
        }
        
        return -1;
    }
}