import java.io.*;
class Prime
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pr=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number for Prime check.");
        int p= Integer.parseInt(pr.readLine());
        int c=0;
        for(int a=2;a<=p;a++)
        {
            if (p%a==0)
                c++;
        }
        if(c==1)
        {
            System.out.println(p+" is a Prime Number");
        }
        else
        {
            System.out.println(p+" is NOT a Prime Number");
        }
        System.out.println("Thank You for Using");
    }
}
