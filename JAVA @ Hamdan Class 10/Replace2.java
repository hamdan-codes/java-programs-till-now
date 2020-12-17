import java.io.*;
class Replace2
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
        char n  = (char)br.read();
        char c;
        int a=0;
        int l = s.length();
        System.out.print("New String = ");
        for(a=0;a<l;a++)
        {
            c=s.charAt(a);
            if(c==o)
                c=n;
            System.out.print(c);
        }
        
    }
}