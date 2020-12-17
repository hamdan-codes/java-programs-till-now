import java.io.*;
class Series
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int l=5,w=1;
        for(int i=l;i>=1;i--)
        {
            for(int j=1;j<i;j++)
                System.out.print("_");
            for(int j=l;j>=i;j--)
                System.out.print(j);
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for(int i=1;i<=3;i++)
        {
            for(int j=4;j>i;j--)
                System.out.print("_");
            for(int j=1;j<=i;j++)
                System.out.print(j);
            for(int j=1;j<i;j++)
                System.out.print(j);
            System.out.println();
        }
        w=3;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<i;j++)
                System.out.print("_");
            for(int j=i;j<=4;j++)
                System.out.print(j);
            for(int j=1;j<=w;j++)
                System.out.print(j);
            System.out.println();
            w=w-1;
        }
        
    }
}
