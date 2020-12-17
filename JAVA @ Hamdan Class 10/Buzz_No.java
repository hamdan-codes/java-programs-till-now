import java.io.*;
class Buzz_No
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter a Number to check Buzz Number ");
        int n= Integer.parseInt(br.readLine());
        if((n%7==0)||(n%10==7))
            System.out.println(n+" is a Buzz Number");
        else
            System.out.println(n+" is not a Buzz Number");
    }
}
