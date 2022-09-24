import java.util.Scanner;
class Digit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c=0;
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            int l=(int)Math.log10(arr[i])+1;
            if(l%2==0)
            c++;
        }
        System.out.println(c);

    }
}