        
        import java.io.*;
        class Triangle
        {
            public static void main(String args[])throws IOException
            {
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Number of lines : ");
                int n=Integer.parseInt(br.readLine());
                int sum=0,max=0,a=0,b=0;
                if(n>0&&n<100)
                {
                    int ar[][]=new int[n][n];
                    System.out.println("Enter Elements : \n");
                    for(int i=0;i<n;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            if(i>=j)
                            {
                                System.out.print("ar["+i+"]["+j+"] : ");
                                ar[i][j]=Integer.parseInt(br.readLine());
                                if(ar[i][j]<0||ar[i][j]>99)
                                {
                                    System.out.println("Numbers to be entered between 0 and 99... Try Again : ");
                                    j--;
                                }
                            }
                            else
                                ar[i][j]=-1;
                            
                        }
                    }
                    System.out.println("Input : ");
                    for(int i=0;i<n;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            if(i>=j)
                                System.out.print(ar[i][j]+"\t");
                            else
                                System.out.print("\t");
                        }
                        System.out.println();
                    }
                    System.out.println("\nOutput : \n");
                    int c=0;
                    while(c<n)
                    {
                        for(int i=0;i<n-1;i++)
                        {
                            for(int j=0;j<n-i;j++)
                            {
                                sum=sum+ar[j][c];
                            }
                        }
                        c++;
                    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        else
            System.out.println("No. of rows was to be entered between 1 and 99 !!! Try Again !!!");
    }
}
