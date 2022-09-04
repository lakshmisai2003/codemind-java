import java.util.Scanner;
class Prime
{
    public static boolean Prime(int n)
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
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,m,sum;
        n=sc.nextInt();
        m=sc.nextInt();
        sum=n+m;
        int count=0;
        for(int i=sum+1;;i++)
        {
            count++;
            if(Prime(i))
            break;
        }
        System.out.println(count);
        
    }
}