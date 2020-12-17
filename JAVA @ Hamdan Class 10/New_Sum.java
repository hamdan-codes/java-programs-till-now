import java.io.*;
class New_Sum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter Any Number");
        int d=Integer.parseInt(br.readLine());
        int a=0,b=0;
        while(d>0)
        {
            a=d%10;
            if(a%2==0)
                b=(b*10)+a;
            d=d/10;
        }
        int y=0,z=0;
        while(b>0)
        {
            y=b%10;
            z=(z*10)+y;
            b=b/10;
        }
        System.out.println("New Number = "+z);
        int s=0,t=0;
        while(z>0)
        {
            t=z%10;
            s=s+t;
            z=z/10;
        }
        System.out.println("Sum of Digits = "+s);
    }
}
