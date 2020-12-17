import java.io.*;
class Average
{
    public static void main(String Args[])throws IOException
    {
        BufferedReader ave = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the Average Finder ");
        System.out.println("Please Enter total 'Sum' of OBSERVATIONS. ");
        int ts=Integer.parseInt(ave.readLine());
        System.out.println("Please Enter total 'Number' of OBSERVATIONS. ");
        int tn=Integer.parseInt(ave.readLine());
        int a= ts/tn;
        System.out.println("The Average is "+a);
        System.out.println("Thank You for Using");
    }
}