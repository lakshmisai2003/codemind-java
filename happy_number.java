import java.util.Scanner;
class Happy
{
    public static int hap(int n)
    {
        int s=0,r;
        while(n>0)
        {
            r=n%10;
            s=s+(r*r);
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int res=hap(n);
        while((int)Math.log10(res)+1>1)
        {
            int val=hap(res);
            res=val;
        }
        if(res==1 || res==7)
        System.out.println("True");
        else
        System.out.println("False");
        
    }
}