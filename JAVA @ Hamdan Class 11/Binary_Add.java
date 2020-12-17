import java.io.*;
class Binary_Add
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter First Decimal Number : ");
        long m=Long.parseLong(br.readLine());
        System.out.print("Enter Second Decimal Number : ");
        long n=Long.parseLong(br.readLine());
        long a=0,s=0,ss=0;
        long mm=m,nn=n;
        String s1="",s2="",s4="";
        while(mm>0)
        {
            a=mm%2;
            s1=a+s1;
            mm=mm/2;
        }
        while(nn>0)
        {
            a=nn%2;
            s2=a+s2;
            nn=nn/2;
        }
        s=m+n;
        ss=s;
        while(s>0)
        {
            a=s%2;
            s4=a+s4;
            s=s/2;
        }
        System.out.println("Binary of "+m+"           = "+s1);
        System.out.println("Binary of "+n+"           = "+s2);
        System.out.println("Sum =     "+ss+"   Binary = "+s4);
    }
}










