import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,a,b,sum=0;
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b )
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}