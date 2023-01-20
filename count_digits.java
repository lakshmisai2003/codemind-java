import java.util.*;
class Count
{
    public static int count(int a)
    {
        int c=0;
        while(a>0)
        {
            int d=a%10;
            c++;
            a=a/10;
        }
    return c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if (arr[i]==0)
            {
              System.out.print("1"+" ");
              continue;
            }
            if (arr[i]<0)
            arr[i]=arr[i]*(-1);
            System.out.print(count(arr[i])+" ");
        }
    }
}