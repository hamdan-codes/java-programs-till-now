import java.io.*;
class Greater_100
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter The Array Length");
        int l=Integer.parseInt(br.readLine());
        int z,y;
        int a[]=new int[l];
        for(z=0;z<l;z++)
        {
            System.out.println("Please Enter Array Value");
            a[z]=Integer.parseInt(br.readLine());
        }
        System.out.println("The Numbers Greater than 100 are : ");
        int k=0;
        for(z=0;z<l;z++)
        {
            if(a[z]>100)
            {
                k=k+1;
            }
        }
        int b[]=new int [k];
        k=0;
        for(z=0;z<l;z++)
        {
            if(a[z]>100)
            {
                b[k]=a[z];
                k=k+1;
            }
        }
        for(z=0;z<k;z++)
        {
            System.out.print(b[z]+"    ");
        }
    }
}
