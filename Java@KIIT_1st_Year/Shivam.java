import java.io.*;
class Shivam
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int a=0,ans=0,b=0,n,d,m;
        System.out.print("Enter number : ");
        n=Integer.parseInt(br.readLine());
        System.out.print("Enter digit to search : ");
        d=Integer.parseInt(br.readLine());
        m=n;
        while(m>0)
        {
            b++;
            a=m%10;
            if(a==d)
                System.out.println("Found at : "+b);
            m/=10;
        }
    }
}
