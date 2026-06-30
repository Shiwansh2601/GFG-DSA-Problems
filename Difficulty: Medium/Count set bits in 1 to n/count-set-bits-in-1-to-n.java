class Solution {
    public static int countSetBits(int n) {
        // code here
        if(n==0)return 0; 
        int x=(int)(Math.log(n) / Math.log(2));
        
       int p = 1 << x; // 2^x

        return x * (1 << (x - 1)) + (n - p + 1) + countSetBits(n - p);
    }
}