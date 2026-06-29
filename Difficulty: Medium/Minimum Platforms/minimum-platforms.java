class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        
        int[] pre=new int[2361];
        
        for(int i=0;i<arr.length;i++)
        {
            pre[arr[i]]++;
            pre[dep[i]+1]--;
        }
        
        
        int max=0;
        
        for(int i=1;i<pre.length;i++)
        {
            pre[i]+=pre[i-1];
            
            max=Math.max(max,pre[i]);
        }
        
        return max;
        
    }
}
