class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        res.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            res.add(res.get(i-1)+arr[i]);
        }
        return res;
    }
}