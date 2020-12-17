import java.io.*;
class Ulta_Check
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter any Word To Check it Palindrome");
        String w= br.readLine();
        String ww="",www="";
        int a=0;
        int l=w.length();
        char z,y;
        for(a=l-1;a>=0;a--)
        {
            z=w.charAt(a);
            ww=ww+z;
            y=w.charAt(l-(a+1));
            while(z==y)
            {
                www=www+z;
                break;
            }
        }
        int l1=www.length();
        if(l==l1)
            System.out.println(w+" is a Palindrome Word.");
        else
            System.out.println(w+" is NOT a Palindrome Word.");
        System.out.println("And Its Reverse Is "+ww);
    }
}
