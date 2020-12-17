class _4_Pronic
{
    public static void main(int n)
    {
        int m=n;int i=0;
        int a=0,b=0;
        for(i=0;i<(n/2);i++)
        {
            a=i*(i+1);
            if(a==n)
            {
                b=1;
                break;
            }
        }
        if(b==1)
        {
            System.out.println(n+" is a Pronic Number");
            System.out.println("And the two Consecutive numbers are "+i+" and "+(i+1));
        }
        else
            System.out.println(n+" is NOT a Pronic number");
    }
}