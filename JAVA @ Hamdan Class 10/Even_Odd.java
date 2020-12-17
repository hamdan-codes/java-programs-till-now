import java.io.*;
class Even_Odd
{
 public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Values");
        int l=Integer.parseInt(br.readLine());
        int a[]=new int[l];
        int i=0,j=0,k=0,x=0,y=0;
        for(i=0;i<l;i++)
        {
            System.out.println("Enter the Value for array");
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Please Enter The Choice");
        System.out.println("1. Search Odd Numbers");
        System.out.println("2. Search Even Numbers");
        System.out.println("3. Search Both Odd & Even Numbers");
        int z=Integer.parseInt(br.readLine());
    if(z==1)
      {
        for(k=0;k<l;k++)
        {
             if(a[k]%2!=0)
             {
                 System.out.println("ODD numbers Found At "+(k+1));
                }
        }
    }
    if(z==2)
    {
        for(x=0;x<l;x++)
        {
             if(a[x]%2==0)
             {
                 System.out.println("EVEN numbers Found At "+(x+1));
                }
        }
    }
    if(z==3)
    {
        for(y=0;y<l;y++)
        {
             if(a[y]%2!=0)
             {
                 System.out.println("ODD number Found At "+(y+1));
                }
             if(a[y]%2==0)
             {
                 System.out.println("EVEN number Found At "+(y+1));
                }
        }
    }
         System.out.println("Thank You for Using");
 }
}
