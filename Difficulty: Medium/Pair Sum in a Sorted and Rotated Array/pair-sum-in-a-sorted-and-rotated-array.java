
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(arr[i]))
            return true;
            
            set.add(target-arr[i]);
        }
        
        return false;
    }
}
