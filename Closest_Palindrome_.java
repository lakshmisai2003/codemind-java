import java.util.Scanner;
class Palindrome
{
    public static boolean pal(int n)
    {
        int r,rev=0,temp=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        if (temp==rev)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=n,l=n,d1,d2;
        if(pal(n))
        {
            r++;
            l--;
        }
        for(int i=r;;i++)
        {
            if(pal(i))
            {
             d1=i;
             break;   
            }
        }
        for(int i=l;;i--)
        {
            if(pal(i))
            {
                d2=i;
                break;
            }
        }
        int l1=Math.abs(d1-n);
        int l2=Math.abs(d2-n);
        if(l1==l2)
        System.out.println(d2+" "+d1);
        else if(l1>l2)
        System.out.println(d2);
        else
        System.out.println(d1);
    }
}