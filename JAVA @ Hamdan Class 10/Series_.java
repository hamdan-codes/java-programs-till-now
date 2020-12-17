import java.io.*;
class Series_
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the number to which you want to print Series");
        int n=Integer.parseInt(br.readLine());
        float a=0,b=0;
        float c=0,d=0;
        for(a=1;a<=n;a++)
        {
            System.out.print("   +   "+a+"/"+((n+1)-a));
            d=a/((n+1)-a);
            c=c+d;
        }
        System.out.print("    =    "+c);
    }
}