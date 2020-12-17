import java.io.*;
class Gyanig
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int c=1,k=1,m,n,i,j,a=0,b=0;
        System.out.println("Enter m and n of mXn matrix : ");
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());
        int ar[][]=new int[m][n];
        System.out.println("Matrix initialized : \n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                ar[i][j]=c++;
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\n\nBoundary Elements : \n\n\n");
        for(i=0;i<2*(m+n-2);i++)
        {
            if(k<=n)
            {
                System.out.print(ar[a][b]+"\t");
                b++;
            }
            else if(k<=(n+m-1))
            {
                a++;
                System.out.print(ar[a][b-1]+"\t");
            }
            else if(k<=(2*n+m-2))
            {
                b--;
                System.out.print(ar[a][b-1]+"\t");
            }
            else if(k<=(2*(m+n-2)))
            {
                System.out.print(ar[a-1][b-1]+"\t");
                a--;
            }
            k++;
        }
    }
}








