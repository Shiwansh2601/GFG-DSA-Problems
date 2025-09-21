
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        int s=0;
        int e=0;
        int sum=0;
        while(e<arr.length)
        {
            
            
                sum+=arr[e++];
                while(sum>target)
                {
                    sum-=arr[s++];
                }
        
               
                
            if(sum==target)
            {
                res.add(s+1);
                res.add(e);
                return res;
            }
            
        }
        
        res.add(-1);
        return res;
    }
}
