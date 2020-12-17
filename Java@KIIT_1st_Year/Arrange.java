import java.util.*;
class Arrange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int ans[]=new int[t];
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int sum=0;
            for(int j=0;j<n;j++)
                sum=sum+sc.nextInt();
            ans[i]=sum%k;
        }
        for(int i=0;i<t;i++)
            System.out.println(ans[i]);
    }
}
