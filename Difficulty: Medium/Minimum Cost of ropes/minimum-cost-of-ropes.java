class Solution {
    public static int minCost(int[] arr) {
        // code here
        if(arr.length==1)
        return 0;
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        
        int sum=0;
        while(!pq.isEmpty())
        {
            int a=pq.remove();
            int b=pq.remove();
            int curr=a+b;
            sum+=curr;
            
            if(pq.isEmpty())
            break;
            else
            pq.add(curr);
        }
        
        return sum;
    }
}