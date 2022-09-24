import java.util.Scanner;
class Small
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
        int c=0,mx=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]==arr[i] && j!=i)
                c++;
            }
            if(c==0 && mx<arr[i])
            mx=arr[i];
            else
            c=0;
        }
        if (mx>0)
        System.out.println(mx);
        else
        System.out.println("-1");
    }
}