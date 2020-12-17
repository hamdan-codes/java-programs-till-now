import java.io.*;
class alphabet
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the Alphabet to which you want ");
        char a= (char)System.in.read();
        System.out.println("The Alphabets are :");
        for(char s='A'; s<=a;s++)
        {
            System.out.print("");
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("Thank You for Using");
    }
}
