class Solution {
    
    public boolean issafe(int col,int row,char[][] board,int n)
    {

        int c=col;
        int r=row;
        while(c>=0)
        {
            if(board[r][c]=='Q')
            return false;

            c--;
        }

        c=col;
        r=row;
        while(c>=0 && r>=0)
        {
            if(board[r][c]=='Q')
            return false;
            c--;
            r--;
        }

         c=col;
        r=row;
        while(c>=0 && r<n)
        {
            if(board[r][c]=='Q')
            return false;
            c--;
            r++;
        }
        
        return true;

    }
    
    
      public void solve(int col,char[][] board,ArrayList<ArrayList<Integer>>res,int n)
    {
        if(col==n)
        {
            ArrayList<Integer>one=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(board[i][j]=='Q')
                    {
                        one.add(j+1);
                        break;
                    }
                }
            }
             res.add(one);
            return;
        }

        for(int row=0;row<n;row++)
        {
            if(issafe(col,row,board,n))
            {
                board[row][col]='Q';
                solve(col+1,board,res,n);
                board[row][col]='.';   // Backtrack
            }
        }
    }
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        char[][] board=new char[n][n];

        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.'); // imp
        }

        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        solve(0,board,res,n);


        return res;
    }
}