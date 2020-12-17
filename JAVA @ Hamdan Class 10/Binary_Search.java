import java.io.*;
class Binary_Search
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
        int zz=Integer.parseInt(br.readLine());
        if(zz==1)
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
        System.out.println("Enter a value to Search");
        int n=Integer.parseInt(br.readLine());
        int  m=0,t=0,b=(l-1),c=0; 
        while(true)
        {
             m=(t+b)/2;
             if(a[m]==n)
             {
                 System.out.println("Value Found at "+(m+1));
                 c=1;
                 break;
             }
             if(b==m||t==m)
                break;
             if(n>a[m])
               t=m+1;
             else
               b=m-1;
        }
        if(c==0)
            System.out.println("Value NOT found !!!");
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
        System.out.println("Enter a value to Search ");
         int n=Integer.parseInt(br.readLine());
         
        int  m=0,t=0,b=(l-1); 
        while(true)
        {
             m=(t+b)/2;
             
             if(a[m]==n)
             {
                 System.out.println("Value Found at "+(m+1));
                 break;
             }
             
             if(n<a[m])
               t=m+1;
             else
               b=m-1;
        }
    }
    else if((zz>2)||(zz<1))
    {
        System.out.println("Wrong Choice Try Again");
    }
        System.out.println();
         System.out.println("Thank You for Using");
}
}
