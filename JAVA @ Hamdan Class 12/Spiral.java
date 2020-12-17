class Spiral
{
    public static void main(int l)
    {
        int a[][]=new int[l][l];
        for(int i=0;i<l;i++)
            a[0][i]=i+1;
        int eo=l%2;
        int q=0,w=l-1;
        int c=l+1;
        int kk=l-1;
        for(int i=0;i<l;i++)
        {
            for(int j=1;j<=2;j++)
            {
                for(int k=1;k<=kk;k++)
                {
                    if(eo==1)
                    {
                        if(kk%2==0&&j==1)
                            q++;
                        else if(kk%2==0&&j==2)
                            w--;
                        else if(kk%2==1&&j==1)
                            q--;
                        else if(kk%2==1&&j==2)
                            w++;
                    }
                    else if(eo==0)
                    {
                        if(kk%2==0&&j==1)
                            q--;
                        else if(kk%2==0&&j==2)
                            w++;
                        else if(kk%2==1&&j==1)
                            q++;
                        else if(kk%2==1&&j==2)
                            w--;
                    }
                    a[q][w]=c++;
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
