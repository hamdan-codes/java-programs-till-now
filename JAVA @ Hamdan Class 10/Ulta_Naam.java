import java.io.*;
class Ulta_Naam
{
    public static void main(String args[])throws IOException
    {
        BufferedReader fr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter your name ");
        String naam = fr.readLine();
        String ul = " ";
        int l = naam.length();
        for (int k=l-1;k>=0;k--)
        {
            char ulta = naam.charAt(k);
            ul = ul + ulta;
        }
        System.out.print("Your Reverse Name is "+ul);
        System.out.println();
        System.out.println("Thank You for Using");
    }
}
