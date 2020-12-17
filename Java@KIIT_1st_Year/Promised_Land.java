import java.io.*;
class Promised_Land
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,n,x,y,s,ar[][],a[],b[],i,j,ii,jj,c,k=0;
        System.out.println("Enter no. of rows and columns :");
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());
        ar=new int[m][n];
        System.out.println("Enter no. of rivers flowing in row-wise and then enter that in column-wise :");
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());
        System.out.println("Enter size of House : ");
        s=Integer.parseInt(br.readLine());
        a=new int [x];
        b=new int [y];
        if(x>0)
            System.out.println("Enter place(s) of row(s) in which river(s) is/are flowing    : ");
        for(i=0;i<x;i++)
            a[i]=Integer.parseInt(br.readLine());
        if(y>0)
            System.out.println("Enter place(s) of column(s) in which river(s) is/are flowing : ");
        for(i=0;i<y;i++)
            b[i]=Integer.parseInt(br.readLine());
        for(i=0;i<x;i++)
            for(j=0;j<n;j++)
                ar[a[i]-1][j]=-1;
        for(i=0;i<y;i++)
            for(j=0;j<m;j++)
                ar[j][b[i]-1]=-1;
        for(i=0;i<=m-s;i++)
            for(j=0;j<=n-s;j++)
            {
                c=0;
                for(ii=0;ii<s;ii++)
                    for(jj=0;jj<s;jj++)
                        if(ar[i+ii][j+jj]==0)
                            c++;
                if(c==(s*s))
                {
                    k++;
                    for(ii=0;ii<s;ii++)
                        for(jj=0;jj<s;jj++)
                            ar[i+ii][j+jj]=k;
                }
            }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(ar[i][j]==-1)
                    System.out.print("//\t");
                else if(ar[i][j]==0)
                    System.out.print("@@\t");
                else
                    System.out.print(ar[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("\n\n");
        System.out.println("Total Houses that can be constructed = "+k);
    }
}
