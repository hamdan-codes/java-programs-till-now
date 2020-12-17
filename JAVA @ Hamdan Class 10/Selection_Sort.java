import java.io.*;
class Selection_Sort
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
       for(int z=0;z<l;z++)
       {
        for(int j=z+1;j<l;j++)
        {
             if(a[z]>a[j])
             {
                 g=a[z];
                 a[z]=a[j];
                 a[j]=g;
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
        for(int z=0;z<l;z++)
        {
        for(int j=(z+1);j<l;j++)
        {
             if(a[z]<a[j])
             {
                 g=a[z];
                 a[z]=a[j];
                 a[j]=g;
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
        for(int z=0;z<l;z++)
        {
        for(int j=(z+1);j<l;j++)
        {
             if(a[z]>a[j])
             {
                 g=a[z];
                 a[z]=a[j];
                 a[j]=g;
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
        for(int z=0;z<l;z++)
        {
        for(int j=(z+1);j<l;j++)
        {
             if(a[z]<a[j])
             {
                 g=a[z];
                 a[z]=a[j];
                 a[j]=g;
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
