import java.io.*;
class Star_Hatsh
{
    public static void main(String args[])throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Please Enter The Number to which You want Series");
         int n = Integer.parseInt(br.readLine());
         int a= 0,b=0;
         for(a=1;a<=n;a++) 
         {
             System.out.println();
             for(b=a;b<=n;b++) 
             {
                 if(b%2==0)
                    System.out.print(" #");
                 else
                    System.out.print(" *");
             }
         }
    }
}
