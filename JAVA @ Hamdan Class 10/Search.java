import java.io.*;
class Search
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The number of Values You want to Enter for Array");
        int l=Integer.parseInt(br.readLine());
        int a[]=new int[l];
        int i=0,j=0,k=0;
        for(i=0;i<l;i++)
        {
            System.out.println("Please Enter value for Array");
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Please Enter The Value To Search");
        int n=Integer.parseInt(br.readLine());
        for(j=0;j<l;j++)
        {
             if(a[j]==n)
             {
                 System.out.println("Found At "+(j+1));
                }
         }
         
         System.out.println("Thank You for Using");
    }
}
