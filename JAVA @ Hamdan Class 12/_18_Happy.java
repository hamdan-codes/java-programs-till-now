class _18_Happy
{
    public static void main(int n)
    {
        int m=n;int z=n;
        int a=0,b=0,c=0;
        int k=1;
        while(z>9)
        {
            b=0;
            while(z>0)
            {
                a=z%10;
                z=z/10;
                b=b+(a*a);
            }
            System.out.println("After Step "+(k++)+" sum of Squares of Digits = "+b);
            z=b;
        }
        if(b==1)
            System.out.println("Hence, "+n+" is a Happy Number");
        else
            System.out.println("Hence, "+n+" is NOT a Happy Number");
    }
}