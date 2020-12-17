class patter__
{
    public static void main()
    {
        int a,b;
        for(a=1;a<=5;a++)
        {
            for(b=1;b<=a;b++)
            {
                if(b%2==0)
                    System.out.print("@");
                else
                    System.out.print("$");
            }
            System.out.println();
        }
    }
}
