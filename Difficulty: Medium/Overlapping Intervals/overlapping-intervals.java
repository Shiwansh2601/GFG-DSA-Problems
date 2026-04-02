class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        ArrayList<int[]>res=new ArrayList<>();
        int ls=arr[0][0];
        int le=arr[0][1];
        
        int i=1;
        boolean check=true;
        while(i<arr.length)
        {   
            check=false;
            while(i<arr.length && arr[i][0]<=le)
            {
                le=Math.max(le,arr[i][1]);
                i++;
            }
            
            res.add(new int[]{ls,le});
            
            if(i<arr.length)
            {
                ls=arr[i][0];
                le=arr[i][1];
            }
        }
        
        if(check)
        {
            res.add(new int[]{ls,le});
        }
        return res;
    }
}