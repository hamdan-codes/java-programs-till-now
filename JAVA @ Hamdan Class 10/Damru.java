class Damru
{
    public static void main()
    { 
        int y=0,x=0; 
        for(y=1;y<=5;y++)
         {
             System.out.println();
            for(x=1;x<=y;x++)
            {
                System.out.print(" ");
            } 
             for(x=y;x<=5;x++)
            {
                 System.out.print("*");
            } 
             for(x=y;x<=5;x++)
            {
                 System.out.print("*");
            }
        } 
        int m=0,n=0;
        for(m=1;m<=5;m++)
        {
            System.out.println();
            for(n=m;n<=5;n++)
            {
                System.out.print(" ");
            }
            for(n=1;n<=m;n++)
            {
                System.out.print("*");
            }
            for(n=1;n<=m;n++)
            {
                System.out.print("*");
            }
        } 
    }
}