import java.io.*;
class Any_to_Dec
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Octal to Decimal ");
        System.out.print("Please Enter Your Choice : ");
        int s= Integer.parseInt(br.readLine());
        int n=0;
        int m=0;
        String b="",b1="",g="";
        int i=0,j=0;
        double d=0,e=0;
        char c;
        if(s==1)
        {
            System.out.print("Please Enter the Number : ");
            n= Integer.parseInt(br.readLine());
            m=n;
            while(n!=0)
            {
                d=Math.pow(2,i);
                d=d*(n%10);
                e=e+d;
                i++;
                n=n/10;
            }
            long ee=(long)e;
            System.out.println("Decimal Equivalent to Binary "+m+" = "+ee+"");
            System.out.println();
            System.out.println("\t Thanks for Using !!!!!!");
        }
        else if(s==2)
        {    
            System.out.print("Please Enter the Number : ");
            n= Integer.parseInt(br.readLine());
            m=n;
            while(n!=0)
            {
                d=Math.pow(8,i);
                d=d*(n%10);
                e=e+d;
                i++;
                n=n/10;
            }
            long ee=(long)e;
            System.out.println("Decimal Equivalent to Octal "+m+" = "+ee+"");
            System.out.println();
            System.out.println("\t Thanks for Using !!!!!!");
        }
        else 
            System.out.println("Wrong Choice Try Again");
    }
}
