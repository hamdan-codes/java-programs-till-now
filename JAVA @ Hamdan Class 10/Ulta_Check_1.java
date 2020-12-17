import java.io.*;
class Ulta_Check_1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input:");
        System.out.println("Please Enter any Word To Check it Palindrome : ");
        String w= br.readLine();
        String ww="",www="";
        int a=0;
        int l=w.length();
        char z;
        System.out.println("Output:");
        for(a=l-1;a>=0;a--)
        {
            z=w.charAt(a);
            ww=ww+z;
        }
        if(w.equals(ww)==true)
            System.out.println(w+" is a Palindrome Word.");
        else
            System.out.println(w+" is NOT a Palindrome Word.");
        System.out.println("And Its Reverse Is "+ww);
        System.out.println("Thanks for Using");
    }
}
