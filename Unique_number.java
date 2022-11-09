import java.util.Scanner;
class Unique
{
    public static String Unique(String n)
    {
        int l=n.length();
        for(int i=0;i<l;i++)
        {
           char s=n.charAt(i);
           for(int j=(l-1);j>i;j--)
           {
               if (n.charAt(j)==s)
               return "Not Unique Number";
            }
        }
        return "Unique Number";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n= sc.nextLine();
        System.out.println(Unique(n));
    }
}