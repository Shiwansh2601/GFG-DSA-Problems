class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        int res=1;
        
        while(n>0)
        {
            res=res*2;
            n--;
        }
        
        return res-1;
    }
}
