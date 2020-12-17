import java.io.*;
class SI
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ch= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the Simple Interest Teller");
        System.out.println("Please enter the Principal");
        int p= Integer.parseInt(ch.readLine());
        System.out.println("Please enter the Rate per annum");
        int r= Integer.parseInt(ch.readLine());
        System.out.println("Please enter the Time in Years");
        int t= Integer.parseInt(ch.readLine());
        int s=(p*r*t)/100;
        System.out.println("The Interest for principal Rs. "+p+" at rate "+r+" % per annum for "+t+" Years is Rs. "+s);
        System.out.println("Thank You for Using");
    }
}