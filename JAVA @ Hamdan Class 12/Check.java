import java.io.*;
class Check extends Palindrome_Num
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("All Numbers should be of 2 digits..... ");
        System.out.print("Enter Lower limit : ");
        int l=Integer.parseInt(br.readLine());
        System.out.print("Enter Upper limit : ");
        int u=Integer.parseInt(br.readLine());
        Check pn=new Check();
        for(int i=l;i<=u;i++)
            pn.palindrome(i);
    }
}