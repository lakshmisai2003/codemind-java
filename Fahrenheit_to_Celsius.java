import java.util.Scanner;
class Conversion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int f=sc.nextInt();
        double c=(float)(f-32)/1.8;
        System.out.format("%.2f",c);
    }
}