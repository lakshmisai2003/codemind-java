import java.util.Scanner;
class Palindrome
{
    public static boolean Pal(int n)
    {
        int rev=0,r,temp=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        if(rev==temp)
        return true;
        else
        return false;
    }
     public static int rev(int n)
    {
        int rev=0,r,temp=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,r,sum;
        n=sc.nextInt();
        r=rev(n);
        sum=r+n;
        while(sum>0)
        {
            if(Pal(sum))
            {
                System.out.println(sum);
                break;
            }
            sum=sum+rev(sum);
        }
        
        
    }
}