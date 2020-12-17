class _13_Cartons
{
    public static void main(int No_of_Boxes)
    {
        int n=No_of_Boxes;
        int a=n;int x=0,y=0;int k=0;
        System.out.println("Total Boxes = "+n);
        if(n<=1000)
        {
            while(a>0)
            {
                if(a>=48)
                {
                    x=a/48;
                    y=x*48;
                    System.out.println("48 X "+x+" = "+y);
                    k=k+x;
                }
                else if(a>=24)
                {
                    x=a/24;
                    y=x*24;
                    System.out.println("24 X "+x+" = "+y);
                    k=k+x;
                }
                else if(a>=12)
                {
                    x=a/12;
                    y=x*12;
                    System.out.println("12 X "+x+" = "+y);
                    k=k+x;
                }
                else if(a>=6)
                {
                    x=a/6;
                    y=x*6;
                    System.out.println("6 X "+x+" = "+y);
                    k=k+x;
                }
                else
                {
                    y=a;
                    System.out.println("Remaining Boxes = "+a);
                    System.out.println("1 more Carton of 6 Boxes capacity required");
                    x=1;
                    k=k+x;
                }
                a=a-y;
            }
            System.out.println("Hence, Total Number of Cartons required = "+k);
        }
        else
            System.out.println("Please Enter value less than or equal to 1000");
    }
}