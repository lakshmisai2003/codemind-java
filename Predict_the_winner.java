import java.util.Scanner;
class Winner
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
        int s1=0,s2=0;
        for(int i=0;i<n;i+=2)
        {
            s1+=arr[i];   
        }
        for(int j=1;j<n;j+=2)
        {
            s2+=arr[j];   
        }
        if(Math.abs(s1-s2)%4==0)
        System.out.println("X");
        else
        System.out.println("Y");
        
    }
    
}