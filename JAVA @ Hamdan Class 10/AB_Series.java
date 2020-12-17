import java.io.*;
class AB_Series
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=0,b=0;
        System.out.println("Please Enter The Length");
        int l = Integer.parseInt(br.readLine());
        for(a=1;a<=l;a++)
        {
            for(b=1;b<a;b++)
            {
                System.out.print("A");
            }
            System.out.print("@");
            for(b=a;b<l;b++)
            {
                System.out.print("B");
            }
            System.out.println();
        }
    }
}
