import java.util.*;
public class Main {
    
    public static int onacci(int a,int b,int c,int d)
    {
        if(d==1)
        return a;
        
        if(d==2)
        return b;
        
        if(d==3)
        return c;
        
        return onacci(a,b,c,d-1)+onacci(a,b,c,d-2)+onacci(a,b,c,d-3);
        
    }
    public static void main(String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        while(n>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            
            System.out.println(onacci(a,b,c,d));
            n--;
        }
    }
}