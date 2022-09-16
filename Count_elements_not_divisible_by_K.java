import java.util.Scanner;
class Divisible
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int c=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
       
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k!=0)
            c++;
        }
        System.out.println(c);
        
    }
}