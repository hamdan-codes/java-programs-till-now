import java.io.*;
class Short_name
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter Your First name");
        String a = br.readLine();
        char aa= a.charAt(0);
        System.out.println("Please Enter Your Middle name");
        String m = br.readLine();
        char mm= m.charAt(0);
        System.out.println("Please Enter Your Last name");
        String l = br.readLine();
        System.out.println("After Shortening Your name becomes :");
        System.out.println(aa+". "+mm+". "+l);
        System.out.println("Thank You for Using");
    }
}
