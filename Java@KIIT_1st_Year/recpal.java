import java.io.*;
class recpal
{
    static int b=0;
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number : ");
        int n=Integer.parseInt(br.readLine());
        int ans=ulta(n);
        System.out.println("Ulta = "+ans);
        if(ans==n)
            System.out.println("Plindrome number ");
        else
            System.out.println("Not a Plindrome number ");
    }
    static int ulta(int m)
    {
        if(m>0)
        {
            b=b*10+(m%10);
            ulta(m/10);
        }
        return b;
    }
}
