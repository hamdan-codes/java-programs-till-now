import java.util.*;
class Hashing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        System.out.println("Enter elements : ");
        int hash[]=new int[21];
        int max=0,a;
        for(int i=0;i<n;i++)
        {
            a=sc.nextInt();
            hash[a]++;
        }
        for(int i=0;i<21;i++)
        {
            System.out.println("     "+hash[i]);
        }
    }
}
