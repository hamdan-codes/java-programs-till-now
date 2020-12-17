import java.io.*;
class Series2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Factorial : till Number :");
        int f=Integer.parseInt(br.readLine());
        int ans =1;
        for(int a=1;a<=f;a++)
        {
            ans =ans*a;
            System.out.println("Factorial of "+a+" = "+ans);
        }
    }
}
