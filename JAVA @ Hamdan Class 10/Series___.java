class Series___
{
    public static void main()
    {
        int a=0,b=0,c=0;
        for(a=1;a<=2;a++)
        {
            for(b=1;b<a;b++)
            {
                System.out.print("? ");
            }
            System.out.print("# ");
            for(b=a;b<=1;b++)
            {
                System.out.print("* ");
            }
            for(b=a;b<=1;b++)
            {
                System.out.print("* ");
            }
            System.out.print("# ");
            for(b=1;b<a;b++)
            {
                System.out.print("? ");
            }
            System.out.println();
        }
        for(a=1;a<=2;a++)
        {
            for(b=a;b<=1;b++)
            {
                System.out.print("? ");
            }
            System.out.print("# ");
            for(b=1;b<a;b++)
            {
                System.out.print("* ");
            }
            for(b=1;b<a;b++)
            {
                System.out.print("* ");
            }
            System.out.print("# ");
            for(b=a;b<=1;b++)
            {
                System.out.print("? ");
            }
            System.out.println();
        }
    }
}
