import java.util.*;
import java.util.Map.*;
class Average
{
    public static void printOutput(int arr[])
    {
        int min=arr[0],max=0,c=0;
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry entry:hm.entrySet())
        {
            if((int)entry.getKey()==(int)entry.getValue())
            {
                c++;
            }
        }
        System.out.print(c);
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