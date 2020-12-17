import java.io.*;
class CI
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter The Principal");
        double p= Double.parseDouble(br.readLine());
        System.out.println("Please Enter The Rate");
        double r= Double.parseDouble(br.readLine());
        System.out.println("Please Enter The Time in Years");
        double t= Double.parseDouble(br.readLine());
        double aa=r/100;
        double a=1+aa;
        double b=Math.pow(a,t);
        double A = p*b;
        double I = A-p;
        System.out.println("The Amount Outstanding after "+t+" years on Rs. "+p+" at Rate "+r+" % is "+A);
        System.out.println("And The Interest Outstanding after "+t+" years on Rs. "+p+" at Rate "+r+" % is "+I);
    }
}
