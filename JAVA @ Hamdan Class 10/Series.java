import java.io.*;
class Series
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the number to which you want to print Series");
        int n=Integer.parseInt(br.readLine());
        int a=0,b=0;
        for(a=n;a>=1;a--)
        {
            System.out.println();
            for(b=1;b<=a;b++)
            {
                System.out.print(b);
            }
            for(b=n;b>=a;b--)
            {
                System.out.print(" ");
            }
            for(b=n;b>=a;b--)
            {
                System.out.print(" ");
            }
            for(b=a;b>=1;b--)
            {
                System.out.print(b);
            }
        }
        for(a=1;a<=n;a++)
        {
            System.out.println();
            for(b=1;b<=a;b++)
            {
                System.out.print(b);
            }
            for(b=n;b>=a;b--)
            {
                System.out.print(" ");
            }
            for(b=n;b>=a;b--)
            {
                System.out.print(" ");
            }
            for(b=1;b<=a;b++)
            {
                System.out.print(b);
            }
        }
    }
}
