import java.io.*;
class Name_Short
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter a name having 3 names");
        String n=br.readLine();
        int l = n.length();
        int a=0,b=0,d=0,e=0,g=0;
        char c,c1,c2;
        for(a=l-1;a>=0;a--)
        {
            c=n.charAt(a);
            if(c==' ')
                b=(b*0)+a;
        }
        System.out.println("After Shortening the Name Becomes : ");
        char f=n.charAt(0);
        char s=n.charAt(b+1);
        System.out.print(f+". "+s+". ");
        for(d=0;d<l;d++)
        {
            c1=n.charAt(d);
            if(c1==' ')
                e=(e*0)+d;
        }
        for(g=e+1;g<l;g++)
        {
            c2=n.charAt(g);
            System.out.print(c2);
        }
        System.out.println();
        System.out.println();
        System.out.println("Thank you for Using");
    }
}