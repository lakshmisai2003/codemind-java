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
        int c=0,k;
        for(int i=0;i<n;i++)
        {
            k=arr[i];
            //System.out.println(arr[i]);
            for(int j=0;j<n;j++)
            {
                //System.out.println(arr[j]);
                if(arr[j]<k && j!=i)
                c++;
                
            }
            System.out.print(c+" ");
            c=0;
            
        }
    }
}