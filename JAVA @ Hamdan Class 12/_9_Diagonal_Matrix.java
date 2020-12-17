class _9_Diagonal_Matrix
{
    public static void main(int order)
    {
        int n=order;
        int i=0,j=0;
        int a[][]=new int[n][n];
        int x=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    x=(int)(Math.random()*10);
                    a[i][j]=x;
                }
                else
                    a[i][j]=0;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}