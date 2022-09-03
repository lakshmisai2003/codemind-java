import java.util.Scanner;
class ArrofPrime
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
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k =sc.nextInt();
        int count=0;
        for(int j=0;j<n;j++)
        {
            if(arr[j]==1)
            continue;
            if((arr[j])<=k)
            {
                if (prime(arr[j]))
                count++;
            }
            
        }
        System.out.println(count);
    }
}