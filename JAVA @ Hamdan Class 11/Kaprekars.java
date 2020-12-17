import java.io.*;
class Kaprekars
{
    public static void main(String args[])throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Please Enter Initial number : ");
      int p=Integer.parseInt(br.readLine());
      System.out.print("Please Enter Final number : ");
      int q=Integer.parseInt(br.readLine());
      int n=0,c=0;
      for(n=p;n<=q;n++)
      {
        int m=n;
        int sq=n*n;
        int k=0;
        double a=0,b=0;
        int sq1=sq;
        while(sq1>0)
        {
            k++;
            sq1=sq1/10;
        }
        n=m;;
        int k2=k/2;
        if(k%2==0)
        {
            a=sq/((int)(Math.pow(10,k2)));
            b=sq%((int)(Math.pow(10,k2)));
        }
        else
        {
            a=sq/((int)(Math.pow(10,(k2+1))));
            b=sq%((int)(Math.pow(10,(k2+1))));
        }
        int i=(int)a;
        int j=(int)b;
        int s=i+j;
        if(s==m)
        {
            System.out.print(m+" , ");
            c++;
        }
      }
      System.out.println();
      System.out.println("Number of Kaprekar Numbers = "+c);
    }
}
