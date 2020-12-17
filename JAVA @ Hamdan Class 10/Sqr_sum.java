import java.io.*;
class Sqr_sum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        double a=0,b=0,sum=0,d=0,num=0,den=1;
        System.out.println("Please Enter base");
        double x= Double.parseDouble(br.readLine());
        System.out.println("Please Enter power");
        double n= Double.parseDouble(br.readLine());
        for(a=1;a<=n;a++)
        {
            num= Math.pow(x,a);
            den=den*a;
            sum=sum+(num/den);
            System.out.println(num/den);
        }
        System.out.println(sum);
    }
}
