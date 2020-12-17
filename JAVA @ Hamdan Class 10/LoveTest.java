import java.io.*;
class LoveTest
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String f="",s="";
        System.out.print("Enter First Name : ");
        f= br.readLine();
        System.out.print("Enter Second Name : ");
        s= br.readLine();
        f=f.toUpperCase();
        int l1=f.length();
        s=s.toUpperCase();
        int l2=s.length();
        int a=0,b=0;
        char c,d;
        int k=0,k1=0,k2=0,z=0;
        String f1="",s1="";
        System.out.println("Love %age between "+f+" & "+s);
        System.out.print("Calculating ");
        for(int yy=1;yy<=5;yy++)
        {
            for(int xx=1;xx<=1000000000;xx++)
            {}
            System.out.print(" *");
        }
        for(a=0;a<l1;a++)
        {
            c=f.charAt(a);
            for(b=0;b<l2;b++)
            {
                d=s.charAt(b);
                if(d==c)
                {
                    f=f.replace(c,'%');
                    s=s.replace(d,'%');
                    k++;
                    break;
                }
            }
        }
        System.out.println();
        for(a=0;a<l1;a++)
        {
            c=f.charAt(a);
            if(c=='%')
                k1++;
        }
        for(a=0;a<l2;a++)
        {
            c=s.charAt(a);
            if(c=='%')
                k2++;
        }
        if(k1<k2)
            z=k1;
        else
            z=k2;
        System.out.println("Common Characters : "+z);
        System.out.print("Calculating ");
        for(int yy=1;yy<=5;yy++)
        {
            for(int xx=1;xx<=1000000000;xx++)
            {}
            System.out.print(" *");
        }
        int h=l1+l2-(z*2);
        long zz=0;
        long qq=0;
        for(b=1;b<=z;b++)
        {
            zz=zz+2;
        }
        for(b=1;b<=h;b++)
        {
            qq=qq+1;
        }
        zz=(zz*10)+qq;
        long q=zz-100;
        if(zz<0)
        {
            zz=zz*(-1);
        }
        if(zz>100)
        {
            zz=zz-q-5;
        }
        if(zz<50)
        {
            zz=zz+25;
        }
        if(zz>90)
        {
            zz=zz-2;
        }
        System.out.println();
        System.out.println();
        System.out.println("\t Love %age = "+zz+"%");
        System.out.println();
        System.out.println();
        System.out.println("Thank You ");
        System.out.println();
    }
}
