import java.util.Scanner;
class Elements
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for (int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       int ev[],od[],j=0,k=0;
       ev=new int[n];
       od=new int[n];
       for (int i=0;i<n;i++)
       {
           if (arr[i]%2==0)
           ev[j++]=arr[i];
           else
           {
           od[k]=arr[i];
           k++;
           }
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(od[i]+" ");
        }
        for(int i=0;i<j;i++)
        {
            System.out.print(ev[i]+" ");
        }
       
    }
}