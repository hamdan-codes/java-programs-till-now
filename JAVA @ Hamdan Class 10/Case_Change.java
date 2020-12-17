import java.io.*;
class Case_Change
{
    public static void main(String args[])throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Please Enter Any String to show it in both Cases");
         String s = br.readLine();
         s= s.toUpperCase();
         System.out.println("In UPPER Case");
         System.out.println(s);
         s= s.toLowerCase();
         System.out.println("In lower Case");
         System.out.println(s);
    }
}
