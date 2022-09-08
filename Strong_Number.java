import java.util.Scanner;
class StrongNum
{
    public static int fac(int n)
    {
        int fc=1;
        for(int i=1;i<=n;i++)
        {
            fc=fc*i;
        }
        return fc;
    }
    public static void main(String args[])
    {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int temp=n,d;
        while(n>0)
        {
            d=n%10;
            sum+=fac(d);
            n=n/10;
        }
        if(sum==temp)
        System.out.println("The number "+temp+" is a strong number");
        else
        System.out.println("The number "+temp+" is not a strong number");
        
    }
}