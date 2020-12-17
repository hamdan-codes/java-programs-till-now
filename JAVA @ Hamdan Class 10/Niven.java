import java.io.*;
class Niven
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter a number to check it is Niven or not : ");
        int n=Integer.parseInt(br.readLine());
        int a=0,b=0,n1=n;
        while(n>0)
        {
            a=n%10;
            b=b+a;
            n=n/10;
        }
        
        if(n1%b==0)
            System.out.println(n1+" is a Niven Number ");
        else
            System.out.println(n1+" is NOT a Niven Number ");
        System.out.println();
        System.out.println("Thank You ");
    }
}
