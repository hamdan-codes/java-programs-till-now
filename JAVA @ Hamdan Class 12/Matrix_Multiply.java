import java.io.*;
class Matrix_Multiply
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Enter the Row of First Matrix     : ");
        int r1=Integer.parseInt(br.readLine());
        System.out.print("Please Enter the Column of First Matrix  : ");
        int c1=Integer.parseInt(br.readLine());
        System.out.print("Please Enter the Row of Srcond Matrix    : ");
        int r2=Integer.parseInt(br.readLine());
        System.out.print("Please Enter the Column of Second Matrix : ");
        int c2=Integer.parseInt(br.readLine());
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c2];
        int i=0,j=0,k=0,l=0;
        int gr=0,sm=0;
        int s=0,sum=0;
        if(r1>=c2)
        {
            gr=r1;
            sm=c2;
        }
        else if(c2>r1)
        {
            gr=c2;
            sm=r1;
        }
        if(c1==r2)
        {
            System.out.println("Enter First Marix Elements : --");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    System.out.print("Enter Element A("+(i+1)+","+(j+1)+") : ");
                    a[i][j]=Integer.parseInt(br.readLine());
                }
            }
            System.out.println();
            System.out.println("Enter Second Marix Elements : --");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print("Enter Element B("+(i+1)+","+(j+1)+") : ");
                    b[i][j]=Integer.parseInt(br.readLine());
                }
            }
            System.out.println();
            System.out.println("Entered Matrix A : --");
            System.out.println();
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
                System.out.println();
            }
            System.out.println("Entered Matrix B : --");
            System.out.println();
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(b[i][j]+"\t");
                }
                System.out.println();
                System.out.println();
            }
            
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    for(k=0;k<c1;k++)
                    {
                        sum=sum+(a[i][k]*b[k][j]);
                    }
                    c[i][j]=sum;
                    sum=0;
                }
            }
            System.out.println();
            System.out.println("Multilplcation Matrix : --");
            System.out.println();
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    System.out.print(c[i][j]+"\t");
                }
                System.out.println();
                System.out.println();
            }
        }
        else
            System.out.println("Wrong Martix Order ...Cannot be Multiplied...");
    }
}
