import java.util.Scanner;
class Average
{
    public static boolean prime(int n)
    {
        int c=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=0,c=0;
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==1)
            continue;
            if(prime(arr[i]))
            {
                sum+=arr[i];
                c++;
            }
            
        }
        double avg=(double)(sum)/c;
        System.out.format("%.2f",avg);
    }
}