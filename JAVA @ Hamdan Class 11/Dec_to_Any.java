import java.io.*;
class Dec_to_Any
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Decimal to Binary ");
        System.out.println("2. Decimal to Octal");
        System.out.println("3. Decimal to Hexadecimal ");
        System.out.print("Please Enter Your Choice : ");
        int s= Integer.parseInt(br.readLine());
        System.out.print("Please Enter the Number : ");
        int n= Integer.parseInt(br.readLine());
        int m=n;
        String b="",b1="",g="";
        int i=0,j=0;
        char c;
        if(s==1)
        {
            j=2;
            g="Binary";
        }
        else if(s==2)
        {    
            j=8;
            g="Octal";
        }
        else if(s==3)
        {
            j=16;
            g="Hexadecimal";
        }
        
        while(n!=0)
        {
            i=n%j;
            if(i==10)
                b=b+'A';
            else if(i==11)
                b=b+'B';
            else if(i==12)
                b=b+'C';
            else if(i==13)
                b=b+'D';
            else if(i==14)
                b=b+'E';
            else if(i==15)
                b=b+'F';
            else
                b=b+i;
            n=n/j;
        }
        for(int aaaa=(b.length())-1;aaaa>=0;aaaa--)
            b1=b1+b.charAt(aaaa);
        System.out.println(g+" Equivalent to "+m+" is "+b1);
        System.out.println();
        System.out.println("\t Thanks for Using !!!!!!");
    }
}
