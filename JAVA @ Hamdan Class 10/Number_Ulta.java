import java.io.*;
class Number_Ulta
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ki= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter The Number to print its Reverse");
        int no= Integer.parseInt(ki.readLine());
        int a=0,b=0;
        while(no>0)
        {
        a=no%10;
        b=(b*10)+a;
        no=no/10;
    }
    System.out.println(b);
    System.out.println("Thank You for Using");
}
}
