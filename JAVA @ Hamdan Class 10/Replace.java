import java.io.*;
class Replace
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the String");
        String s=br.readLine();
        System.out.println("Enter the old char to change");
        char o = (char)br.read();
        System.out.println("Enter the new char to replace");
        char n1 = (char)br.read();
        char n = (char)br.read();
        s=s.replace(o,n);
        System.out.println("New String = "+s);
    }
}