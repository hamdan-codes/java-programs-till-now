import java.io.*;
class palindrome
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pa= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the palindrome checker");
        System.out.println("Please enter the number for Palindrome check");
        int n= Integer.parseInt(pa.readLine());
        int d= 0,p=0,m=n;
        while(n>0)
        {
           d=n%10;
           p=(p*10)+d;
           n=n/10;
        }
        if(p==m)
        {
            System.out.println(m+" is Palindrome");
        }
        else
        System.out.println(m+" is NOT Palindrome");
        System.out.println("Thank You for using");
    }
}
