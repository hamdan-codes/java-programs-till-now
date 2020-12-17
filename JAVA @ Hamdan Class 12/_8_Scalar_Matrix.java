class _8_Scalar_Matrix
{
    public static void main(int order)
    {
        int n=order;
        int i=0,j=0;
        int a[][]=new int[n][n];
        int x=(int)(Math.random()*10);
        while(x==0)
        {
            x=(int)(Math.random()*10);
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
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