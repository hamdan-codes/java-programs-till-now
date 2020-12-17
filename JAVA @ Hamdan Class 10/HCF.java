import java.io.*;
class HCF
{
    public static void main(String args[])throws IOException
    {
        int zz=0;
        BufferedReader far= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the HCF Finder");
        System.out.println("Please enter the First number to find the HCF");
        int m= Integer.parseInt(far.readLine());
        System.out.println("Now Please enter the Second number ");
        int f= Integer.parseInt(far.readLine());
        for(int n=1;n<=m;n++)
        {
            if ((m%n==0)&&(f%n==0))
            {
                 zz= n;
            }
        }
        System.out.println("The HCF of "+m+" and "+f+" is "+zz);
        System.out.println("Thank You for Using");
    }
}
