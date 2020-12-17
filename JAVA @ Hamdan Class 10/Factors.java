import java.io.*;
class Factors
{
    public static void main(String args[])throws IOException
    {
        BufferedReader far= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the number to find its Factors");
        int m= Integer.parseInt(far.readLine());
        System.out.println("The Factors of "+m+" are");
        for(int n= m;n>=1;n--)
        {
            if (m%n==0)
            {
                System.out.println(n);
            }
        }
        System.out.println("Thank You for Using");
    }
}
