import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,a,b,sum1=0,sum2=0;
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum1+=arr[i];
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b )
            {
                sum2+=arr[i];
            }
            
        }
        System.out.println(sum1-sum2);
    }
}