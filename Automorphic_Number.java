import java.util.Scanner;
class Automorphic
{
    public static void main(String args[])
    {
        int n,len,sq;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        len=(int)Math.log10(n)+1;
        sq=n*n;
        sq=sq%(int)(Math.pow(10,len));
        if(sq==n)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
        
        
    }
}