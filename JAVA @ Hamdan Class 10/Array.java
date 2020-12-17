import java.io.*;
class Array
{
 public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter array");
        int l=Integer.parseInt(br.readLine());
        int a[]=new int[l];
        for(int i=0;i<l;i++)
        {
            
            System.out.println("enter element of array");
            a[i]=Integer.parseInt(br.readLine());
        }
        for( int j=0;j<l;j++)
        {
             System.out.println(a[j]);
         }
         System.out.println("Thank You for Using");
}
}
