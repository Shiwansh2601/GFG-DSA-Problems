class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer>set=new TreeSet<>();
        for(int i=0;i<a.length;i++)
        {
            set.add(a[i]);
        }
        
        for(int i=0;i<b.length;i++)
        {
            set.add(b[i]);
        }
        
        ArrayList<Integer>res=new ArrayList<>(set);
        
        return res;
    }
}
