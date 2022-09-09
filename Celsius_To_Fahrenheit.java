import java.util.Scanner;
class Conversion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c=sc.nextInt();
        float f=(float)(c*1.8)+32;
        System.out.format("%.2f",f);
    }
}