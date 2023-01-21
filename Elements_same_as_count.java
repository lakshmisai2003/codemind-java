import java.util.*;
import java.util.Map.*;
class Average
{
    public static void printOutput(int arr[])
    {
        int sum=0,c=0;
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==(int)hm.get(arr[i]))
            {
                System.out.print(arr[i]+" ");
                hm.put(arr[i],0);
                c++;
            }
        }
        if (c==0)
        System.out.print("-1");
    }
    public static void main(String args[])
    {
        int n,arr[];
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printOutput(arr);
    }
}