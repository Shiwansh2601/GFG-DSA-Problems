class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n=profit.length;
        int[][] arr=new int[n][2];
        int max=deadline[0];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=deadline[i];
            arr[i][1]=profit[i];
            
            if(deadline[i]>max)
            max=deadline[i];
        }
        
        Arrays.sort(arr,(a,b)->b[1]-a[1]);
        int[] par=new int[max+1];
        for(int i=0;i<=max;i++)
        {
            par[i]=i;
            
        }
        
        int[] rank=new int[max+1];
        Arrays.fill(rank,0);
        
        int count=0;
        int sum=0;
        
        for(int i=0;i<n;i++)
        {
            int currpr=arr[i][1];
            int deadli=arr[i][0];
            int slot=find(deadli,par);
            if(slot>0)
            {
                count++;
                sum+=currpr;
                union(slot-1,slot,par,rank);
            }
            
        }
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(count);
        ans.add(sum);
        
        return ans;
        
    }
    
    public int find(int i,int[] par)
    {
        if(i==par[i])
        return i;
        
        return par[i]=find(par[i],par);
    }
    
    public void union(int a,int b, int[] par,int[] rank)
    {
        int par_a=find(a,par);
        int par_b=find(b,par);
        
        if(par_a==par_b)
        return;
        
        else if(rank[a]>rank[b])
        {
            par[par_b]=par_a;
        }
        else if(rank[a]<rank[b])
        {
            par[par_a]=par_b;
        }
        else
        {
            par[par_b]=par_a;
            rank[par_b]++;
        }
        
    }
}