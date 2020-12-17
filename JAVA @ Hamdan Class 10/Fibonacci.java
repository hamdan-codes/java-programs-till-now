import java.io.*;
class Fibonacci
{
     public static void main(String args[])throws IOException
     {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the FIRST Number Of the Fibonacci Series");
        int f = Integer.parseInt(br.readLine());
        System.out.println("Please Enter the SECOND Number Of the Fibonacci Series");
        int s = Integer.parseInt(br.readLine());
        System.out.println("Please Enter the Number Of Elements you want in Fibonacci Series");
        int n = Integer.parseInt(br.readLine());
        int sum = 0,a=0,b=0;
        System.out.println("Output: ");
        for(a=1;a<n;a++)
        {
            System.out.print(f+" ");
            sum=f+s;
            f=s;
            s=sum;
        }
    }
}
