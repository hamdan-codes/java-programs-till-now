import java.io.*;
class Array__
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int a[]= new int[5];
        int c=0,b=0,d=0,k=0;
        for(c=0;c<5;c++)
        {
            System.out.println("Please Enter Value of array");
            a[c]=Integer.parseInt(br.readLine());
        }
        for(d=0;d<5;d++)
        {
            if(a[d]<0)
            {
                a[d]=0;
                k++;
            }
            System.out.println(a[d]);
        }
        int z[]=new int[k];
    }
}
