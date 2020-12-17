import java.io.*;
class Arpit_Pattern
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n : ");
        int n=Integer.parseInt(br.readLine());
        int c=n,a=(2*n)-2,ar[][]=new int[2*n-1][2*n-1];
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<=a-i;j++)
            {
                ar[i][j]=c;
                ar[j][i]=c;
                ar[j][a-i]=c;
                ar[a-i][j]=c;
            }
            c--;
        }
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<=a;j++)
                System.out.print(ar[i][j]+"\t");
            System.out.println("\n");
        }
    }
}
