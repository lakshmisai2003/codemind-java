import java.util.Scanner;
class Reverse
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
    public static void main(String args[])
    {
        int n,res;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int p=Math.abs(n);
        res=rev(p);
        if(n<0)
        System.out.println("-"+res);
        else
        System.out.println(res);
        
    }
}