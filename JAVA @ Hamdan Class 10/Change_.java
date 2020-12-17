import java.io.*;
class Change_
{
    public static void main(String args[] )throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Please Enter the String");
        String s=br.readLine();
        System.out.println("Please Enter the Character to be changed ");
        char o=(char)br.read();
        char n1=(char)br.read();
        System.out.println("Please Enter the new Character to replace the old char");
        char n=(char)br.read();
        int l = s.length();
        s=s.replace(o,n);
        System.out.println(s);
    }
}
