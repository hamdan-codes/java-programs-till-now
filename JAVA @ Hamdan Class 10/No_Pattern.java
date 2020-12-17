import java.io.*;
class No_Pattern
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter any Odd number to print Series");
        int aa=Integer.parseInt(br.readLine());
        int a=0,i=0,j=0;
        if(aa%2!=0)
             a=aa;
        else
             System.out.println("Please Try Again & Enter Odd Value");
        for(i=a;i>=1;i--)
        {
            System.out.println();
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            i=i-1;
            System.out.println();
        }
        System.out.println("Thank you for Using");
    }
}