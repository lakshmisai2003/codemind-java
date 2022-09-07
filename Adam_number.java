import java.util.Scanner;
class Adam
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
        int n,sq1,sq2,r;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        //System.out.println(n);
        sq1=n*n;
        r=rev(n);
        //System.out.println(r);
        sq2=r*r;
        //System.out.println(sq1+ " "+sq2);
        if(sq1==rev(sq2))
        System.out.println("True");
        else
        System.out.println("False");
        
    }
}