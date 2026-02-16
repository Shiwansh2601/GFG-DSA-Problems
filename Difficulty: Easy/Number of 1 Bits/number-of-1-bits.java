// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        int bitmask=1;
        int count=0;
        for(int i=0;i<32;i++)
        {   
            bitmask=1;
            int bit=n&(bitmask<<i);
            if(bit!=0)
            count++;
        }
        return count;
    }
}