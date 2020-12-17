import java.io.*;
class Menu
{
    public static void main(String args[])throws IOException
    {
        BufferedReader cr=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("menu");
        System.out.println("1.Harshad No.");
        System.out.println("2.Paterrn");
        System.out.println("3.Product");
        System.out.println("4.ISBN");
        System.out.println("5.Series");
        System.out.println("Enter the choice ");
        int c=Integer.parseInt(cr.readLine());
        int d=0,s=0;
        switch(c)
        {
            case 1:
            System.out.println("Enter the No.");
            int h=Integer.parseInt(cr.readLine());
            int n=h;
            while(n>0)
            {
                d=n%10;
                s=s+d;
                n=n/10;
            }
            if(h%s==0)
            {
               System.out.println(h+"Harshad No.");
            }
           else      
           System.out.println(h+"nOT Harshad No.");    
           break;
            
            case 2:int k=0;
            for(int i=1;i<5;i++)
            {
                for(int j=1;j<=i;j++)
                {
                     k++;
                   System.out.print(k+" ");
                }
                System.out.println();
            }
            break;
            
            case 3:System.out.println("Enter a no.");
            int f=Integer.parseInt(cr.readLine());
            int g = f;
            int v =f%10;
            while(f>0)
            {
                d=f%10;
                s++;
                f=f/10;
            }
            double q =g/(Math.pow(10,(s-1)));
            int p=(int)q;
            int l=v*p;
            System.out.println("Product of 1st and last digit of no. :"+l);                   
            break;
            
            case 4:
            System.out.println("Enter an 10 digit no.");
            long a=Long.parseLong(cr.readLine()),kk=a;
            long hs=0;
            while(a>0)
            { 
               long dd=a%10;
                for(int w=10;w>=1;w--)
                 { hs=hs+(dd*w);  
                }
                a=a/10;
            }
            if(hs%11==0)
            System.out.println(kk+" is an ISBN no.");
            else
            System.out.println(kk+" is not an ISBN no.");
            
            break;            
            case 5:System.out.println("Enter a limit");
            int u=Integer.parseInt(cr.readLine());
            int sss=0;
            for(int e=0;e<=u;e++)
            {
             double ss=Math.pow(2,e);
             sss=(int)ss;
              sss=sss+e;
              System.out.print(sss+" ");
            }
            break;
            
            default:
            
        }
    }
}




