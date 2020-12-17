import java.io.*;
class five_upon_one
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter The Number to which You want Series Sum");
        int n= Integer.parseInt(br.readLine());
        int a=0,b=0,c=0;
        int d= 0,e=0;
        b=5*1;
        c=b/1;
        System.out.print(b+"/1");
        for(a=2;a<=n;a++)
        {
            b=5*a;
            c=b/a;
            System.out.print(" + "+b+"/"+a);
        }
        System.out.print("  =  "+(5*n));
    }
}
