import java.io.*;
class Spiral_Series
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Enter the Length of Series : ");
        int l=Integer.parseInt(br.readLine());
        int a[][]=new int[l][l];
        int eo=l%2;
        System.out.println();
        int k=l-1,kk=l-1,cc=l+1,nn=1;
        for(int i=0;i<l;i++)
        {
            a[0][i]=i+1;
        }
        int q=0,w=l-1;
        for(int i=1;i<l;i++)
        {
            for(int j=1;j<=2;j++)
            {
                for(int n=1;n<=kk;n++)
                {
                    if(eo==1)
                    {
                        if((kk%2==0)&&(j==1))
                        {
                            q++;
                        }
                        else if((kk%2==0)&&(j==2))
                        {
                            w--;
                        }
                        else if((kk%2==1)&&(j==1))
                        {
                            q--;
                        }
                        else if((kk%2==1)&&(j==2))
                        {
                            w++;
                        }
                    }
                    if(eo==0)
                    {
                        if((kk%2==1)&&(j==1))
                        {
                            q++;
                        }
                        else if((kk%2==1)&&(j==2))
                        {
                            w--;
                        }
                        else if((kk%2==0)&&(j==1))
                        {
                            q--;
                        }
                        else if((kk%2==0)&&(j==2))
                        {
                            w++;
                        }
                    }
                    a[q][w]=cc;
                    cc++;
                }
            }
            kk--;
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
