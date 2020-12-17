import java.util.*;
class Raunak
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,c,i,j,k;
        System.out.print("Enter size : ");
        n=in.nextInt();
        int ar[][]=new int[n][n];
        System.out.println("Enter Elements : ");
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                ar[i][j]=in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(ar[i][j]+"\t");
            System.out.println();
        }
        System.out.println("\n\n\n");
        if(n%2==0)
            c=(n/2)-1;
        else
            c=n/2;
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                if(i<=j)
                {
                    k=ar[i][j];
                    ar[i][j]=ar[j][i];
                    ar[j][i]=k;
                }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(ar[i][j]+"\t");
            System.out.println();
        }
    }
}