import java.util.Scanner;
class Candies
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int mx=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>mx)
            mx=a[i];
        }
        int ec=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if((a[i]+ec)>=mx)
            System.out.print("True ");
            else
            System.out.print("False ");
        }
    }
}