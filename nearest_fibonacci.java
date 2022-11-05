import java.util.Scanner;
class Nearest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c,n;
        n=sc.nextInt();
        c=a+b;
        a=b;
        b=c;
        while(c<=n)
        {
           c=a+b;
           a=b;
           b=c;
        }
        int d1=Math.abs(a-n);
        int d2=Math.abs(b-n);
        if(d1>d2)
        System.out.println(b);
        else if(d1==d2)
        System.out.println(a+" "+b);
        else
        System.out.println(a);
    }
}