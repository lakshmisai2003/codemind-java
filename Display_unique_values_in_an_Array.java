import java.util.Scanner;
class Unique
{
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0,k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]==arr[i] && j!=i)
                c++;
            }
            if(c==0)
            {
                System.out.print(arr[i]+" ");
                k++;
            }
            c=0;
        }
        if(k==0)
        System.out.println("-1");
    }
}