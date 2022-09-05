import java.util.Scanner;
class PrimePal
{
    public static boolean isPrime(int n)
    {
        int c=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==0)
        return true;
        else
        return false;
    }
    public static boolean pal(int n)
    {
        int rev=0,r,temp=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==temp)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int j=n+1;;j++)
        {
            if(isPrime(j) && pal(j))
            {
            System.out.println(j);
            break;
            }
        }
    }
}