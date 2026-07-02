// User-defined Solution class

class Solution {
    public int countBT(int h) {
        // code here
        if(h==1)return 1;
        
        if(h==2)return 3;
        
        return countBT(h-1)*countBT(h-2) + countBT(h-2)*countBT(h-1)+countBT(h-1)*countBT(h-1);
    } 
}
