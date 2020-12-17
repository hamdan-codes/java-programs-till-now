import java.io.*;
class Array_Sum
{
 public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The number of values you want to Enter To Find SUM");
        int l=Integer.parseInt(br.readLine());
        int a[]=new int[l];
        int sum = 0;
        for(int i=0;i<l;i++)
        {
            
            System.out.println("Enter The Value");
            a[i]=Integer.parseInt(br.readLine());
            sum=sum+a[i];
        }
         System.out.println("Sum is "+sum);
         System.out.println("Thank You for Using");
}
}
