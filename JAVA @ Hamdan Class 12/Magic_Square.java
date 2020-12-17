class Magic_Square
{
    public static void main(int n)
    {
      if(n<=5)
      {
          
        int a[][]=new int[n][n];
        int c=1,t=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=c++;
        
        if(n%2==0)
        {
            int j=n-1;
            for(int i=0;i<n/2;i++)
            {
                t=a[i][i];
                a[i][i]=a[j][j];
                a[j][j]=t;
                
                t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
            
            
        }
        else
        {
            int i=0;
            int j=n/2;
            c=1;
            while(c<=n*n)
            {
                a[i][j]=c++;
                i--;
                j++;
                if(i<0&&j>n-1)
                {
                    i=i+2;
                    j--;
                }
                if(i<0)
                    i=n-1;
                if(j>n-1)
                    j=0;
                if(a[i][j]>0)
                {
                    i=i+2;
                    j--;
                }
            }
        }
        for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                    System.out.print(a[i][j]+"\t");
                System.out.println("\n");
            }
      }
      else
          System.out.println("Enter n<=5.....Sorry....Try Again...");
    }
}























