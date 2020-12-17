import java.io.*;
class Table
{
    public static void main(String args[])throws IOException
    {
        BufferedReader le= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hi! Welcome to the multiplication table writer");
        System.out.println("Please enter the number of which you want Table");
        int p=Integer.parseInt(le.readLine());
        System.out.println("Please enter the number to which you want multiples ");
        int b=Integer.parseInt(le.readLine());
        System.out.println("The table of "+p+" upto "+b+" multiples is as follows :-");
        for (int a=1;a<=b;a++)
        {
            int z=p*a;
            System.out.println(p+" X "+a+" = "+z);
        }
        System.out.println("Thank You for Using");
    }
}
