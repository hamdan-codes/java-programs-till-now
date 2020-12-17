import java.io.*;
class Perfect
{
    public static void main(String args[])throws IOException
    {
        BufferedReader far= new BufferedReader(new InputStreamReader(System.in));
        int rt=0,n=0;
        System.out.println("Welcome");
        System.out.println("Please Enter the number to to check Perfect or not");
        int m= Integer.parseInt(far.readLine());
        for(n= m;n>=1;n--)
        {
            if (m%n==0)
            {
                rt=n+rt;
            }
        }
        int p=rt-m;
        if(p==m)
        {
            System.out.println("The number is Perfect ");
        }
        else
        System.out.println("The number is not Perfect ");
        System.out.println("Thankyou for Using");
    }
}