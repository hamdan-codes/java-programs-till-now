import java.io.*;
class Pattern
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the Number to which You want upon 5 Series");
        float n=Float.parseFloat(br.readLine());
        float a,b;
        float c=0,d=0;
        for(a=1;a<=n;a++)
        {
            System.out.print("   +   "+a+"/5.0");
            c=a/5;
            d=d+c;
        }
        System.out.println("    =    "+d);
    }
}
