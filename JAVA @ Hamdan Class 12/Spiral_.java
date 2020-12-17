import java.io.*;
class Spiral_
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Enter the Length of Series : ");
        int l=Integer.parseInt(br.readLine());
        int n=1,r1=0,c1=0,r2=l-1,c2=l-1,l2=l*l,a[][]=new int[l][l];
        while(n<=l2)
        {
            for(int i=r1;i<=r2;i++)
                a[r1][i]=n++;
            for(int i=r1+1;i<=r2;i++)
                a[i][r2]=n++;
            for(int i=c2-1;i>=c1;i--)
                a[c2][i]=n++;
            for(int i=c2-1;i>=c1+1;i--)
                a[i][c1]=n++;
            r1++;c1++;r2--;c2--;
        }
        System.out.println("\n");
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println("\n\n");
        }
    }
}
