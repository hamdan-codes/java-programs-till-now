import java.io.*;
class Automorphic
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter any Two Digit Integer to Check it as Automorphic");
        int num=Integer.parseInt(br.readLine());
        int sqr=num*num;
        int rem=sqr%100;
        if(rem==num)
            System.out.println(num+" is an Automorphic Number");
        else
            System.out.println(num+" is NOT an Automorphic Number");
    }
}
