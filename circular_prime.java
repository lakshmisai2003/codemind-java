import java.util.Scanner;
class Circular
{
    public static int rev(int n)
    {
        int r,rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    public static boolean prime(int n)
    {
        int c=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(prime(n))
        {
            int r=rev(n);
            if(prime(r))
            System.out.println("circular prime");
            else
            System.out.println("prime but not a circular prime");
        }
        else
        System.out.println("not prime");
    }
}