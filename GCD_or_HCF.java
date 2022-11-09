import java.util.Scanner;
class Gcd
{
    public static void main(String args[])
    {
        int a,b,gcd=0,mn;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        mn=b;
        else
        mn=b;
        for(int i=mn;i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);
    }
}