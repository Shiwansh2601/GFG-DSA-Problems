// User function Template for Java

class Solution {
    static int toggleBits(int N, int L, int R) {
        // code here
         R--;
        L--;
        int range=R-L+1;
        int mask=((1<<range)-1)<<L;
        
        return N^mask;
    }
};