import java.util.*;
import java.util.Map.*;
class Average
{
    public static float printOutput(int arr[])
    {
        int sum=0,c=0;
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry entry:hm.entrySet())
        {
            if((int)entry.getKey()==(int)entry.getValue())
            {
                sum=sum+(int)entry.getKey();
                c++;
            }
        }
        if(c==0)
        return -1;
        else
        return (float)sum/c;
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
        float res=printOutput(arr);
        if (res<0)
        System.out.println("-1");
        else
        System.out.format("%.2f",res);
    }
}