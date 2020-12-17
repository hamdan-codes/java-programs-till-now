import java.util.*;
public class Arr_Sum
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        if(n>0&&n<=1000)
        {
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=in.nextInt();
                sum=sum+ar[i];
            }
        }
        System.out.print(sum);
    }
}