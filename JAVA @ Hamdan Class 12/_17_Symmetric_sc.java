import java.util.Scanner;
class _17_Symmetric_sc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Matrix Order : ");
        int m=sc.nextInt();
        System.out.println("Enter Values ...");
        int a[][]=new int[m][m];
        int k=0,z=m*m;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==a[j][i])
                    k++;
            }
        }
        if(k==z)
            System.out.println("The Given Matrix is Symmetric Matrix");
        else
            System.out.println("The Given Matrix is NOT a Symmetric Matrix");
        int x=0;int sr=0,sl=0;
        for(int i=0;i<m;i++)
        {
            sl=sl+a[x][i];
            x++;
        }
        System.out.println("Sum of Left Diagonal = "+sl);
        x=0;
        for(int i=m-1;i>=0;i--)
        {
            sr=sr+a[x][i];
            x++;
        }
        System.out.println("Sum of Right Diagonal = "+sr);
    }
}













