import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int s=0;
        for(int j =0;j<n;j++)
        {
            if(arr[j]<=k)
            s+=arr[j];
        }
        System.out.println(s);
    }
}