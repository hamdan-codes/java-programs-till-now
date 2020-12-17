import java.io.*;
class Piglu_
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        String s;
        int l,i;
        long n,k=0,a,b;
        char c;
        System.out.print("Enter String to be repeatedly Infinitely : ");
        s=in.readLine();
        System.out.print("Enter n : ");
        n=Long.parseLong(in.readLine());
        l=s.length();
        a=n%l;
        b=n/l;
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c=='a')
                k++;
        }
        k*=b;
        for(i=0;i<a;i++)
        {
            c=s.charAt(i);
            if(c=='a')
                k++;
        }
        System.out.println("Number of a's = "+k);
    }
}
