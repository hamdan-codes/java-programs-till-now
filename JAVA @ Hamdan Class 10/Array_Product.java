import java.io.*;
class Array_Product
{
 public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The number of values you want to Enter To Find PRODUCT");
        int l=Integer.parseInt(br.readLine());
        int a[]=new int[l];
        int product = 1;
        for(int i=0;i<l;i++)
        {
            
            System.out.println("Enter The Value");
            a[i]=Integer.parseInt(br.readLine());
            product=product*a[i];
        }
         System.out.println("Their Product is "+product);
         System.out.println("Thank You for Using");
}
}
