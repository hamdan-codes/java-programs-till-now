import java.io.*;
class magic
{
    int n=0,aa=0;
    long zz=0,z=0,s=0,t=0,kk=0;
    long num[]=new long[150];
    magic()
    {
        for(int i=0;i<150;i++)
            num[i]=0;
    }
    magic(int nx)
    {
        n=nx;
        if(n>150)
           n=150;
        long num[]=new long[n];
    }
    void input_numbers()throws IOException
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int j=0;j<n;j++)
        {
            System.out.print("Enter the number for Array : ");
            num[j]=Long.parseLong(br.readLine());
        }
    }
    void find_print_magic()throws IOException
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int j=0;j<n;j++)
        {
            z=num[j];
            zz=z;
            while(z>9)
            {
                while(z!=0)
                {
                    s=z%10;
                    t=t+s;
                    z=z/10;
                }
                z=t;
                t=0;
            }
            System.out.println();
            if(z==1)
                System.out.println("The number "+zz+" entered is a 'Magic Number'.");
            else
                System.out.println("O ! O ! The number "+zz+" entered is 'NOT' a Magic Number ! ! !");
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of Array : ");
        int nx=Integer.parseInt(br.readLine());
        magic ob=new magic(nx);
        ob.input_numbers();
        ob.find_print_magic();
    }
}
