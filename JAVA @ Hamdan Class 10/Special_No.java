import java.io.*;
class Special_No
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter A Two Digit Number To Check It A Special Number");
        int n = Integer.parseInt(br.readLine());
        int m=n;
        int n1=n%10;
        n=n/10;
        int sum= n+n1;
        int product=n*n1;
        int sp=sum+product;
        if(sp==m)
            System.out.println(m+" is a Special Number");
        else
            System.out.println(m+" is NOT a Special Number");
    }
}
