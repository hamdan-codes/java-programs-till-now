import java.io.*;
class Magic_Num
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number to check that it is a Magic number or not : ");
        int n=Integer.parseInt(br.readLine());
        int a=0,b=0,c=0,m=n;
        while(n>9)
        {
            while(n!=0)
            {
                a=n%10;
                b=b+a;
                n=n/10;
            }
            n=b;
            b=0;
        }
        if(n==1)
            System.out.println("The number "+m+" entered is a 'Magic Number'.");
        else
            System.out.println("O ! O ! The number "+m+" entered is 'NOT a Magic Number' ! ! !");
    }
}
