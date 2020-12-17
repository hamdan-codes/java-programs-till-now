import java.io.*;
class Bubble_Sort
{
 public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number of Values");
        int l=Integer.parseInt(br.readLine());
        int a[]=new int[l];
        int g=0,h=0;
        for(int i=0;i<l;i++)
        {
            System.out.println("Enter the Value for array");
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Please Enter The Option :");
        System.out.println("1. Arrange in Ascending Order");
        System.out.println("2. Arrange in Descending Order");
        System.out.println("3. Arrange in Both Orders");
        int zz=Integer.parseInt(br.readLine());
    if(zz==1)
    {
      for(int aaa=0;aaa<l;aaa++)
      {
        for(int j=0;j<l-1;j++)
        {
             if(a[j]>a[j+1])
             {
                 g=a[j];
                 a[j]=a[j+1];
                 a[j+1]=g;
             }
         }
      }
        System.out.println();
        System.out.println("The Arrangement of Values in Ascending Order is as follows :"); 
        System.out.println();
         for(int k=0;k<l;k++)
        {
              System.out.println(a[k]);
        }
    }
    if(zz==2)
    {
      for(int aaa=0;aaa<l;aaa++)
        {
        for(int j=0;j<l-1;j++)
        {
             if(a[j]<a[j+1])
             {
                 g=a[j];
                 a[j]=a[j+1];
                 a[j+1]=g;
                }
         }
        }
        System.out.println();
        System.out.println("The Arrangement of Values in Descending Order is as follows :"); 
        System.out.println();
         for(int k=0;k<l;k++)
        {
              System.out.println(a[k]);
        }
    }
    if(zz==3)
    {
        for(int aaa=0;aaa<l;aaa++)
        {
        for(int j=0;j<l-1;j++)
        {
             if(a[j]>a[j+1])
             {
                 g=a[j];
                 a[j]=a[j+1];
                 a[j+1]=g;
                }
         }
        }
        System.out.println();
        System.out.println("The Arrangement of Values in Ascending Order is as follows :"); 
        System.out.println();
         for(int k=0;k<l;k++)
        {
              System.out.println(a[k]);
        }
        for(int aaa=0;aaa<l;aaa++)
        {
        for(int j=0;j<l-1;j++)
        {
             if(a[j]<a[j+1])
             {
                 g=a[j];
                 a[j]=a[j+1];
                 a[j+1]=g;
                }
         }
        }
        System.out.println();
        System.out.println("The Arrangement of Values in Descending Order is as follows :"); 
        System.out.println();
         for(int k=0;k<l;k++)
        {
              System.out.println(a[k]);
        }
    }
    else if((zz>3)||(zz<1))
    {
        System.out.println("Wrong Choice Try Again");
    }
        System.out.println();
         System.out.println("Thank You for Using");
}
}
