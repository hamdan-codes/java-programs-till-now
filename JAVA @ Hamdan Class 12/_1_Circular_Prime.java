class _1_Circular_Prime
{
    public static void main(int n)
    {
        int m=n,a=n,x=0,y=0,z=n;
        int k=0;
        int i=0,t=0;
        while(m>0)
        {
            m=m/10;
            k++;
        }
        int c=(int)Math.pow(10,k-1);
        while (i!=n)
        {
            x=z%c;
            y=z/c;
            i=(x*10)+y;
            System.out.println(i);
            for(int ii=2;ii<i;ii++)
            {
                if(i%ii==0)
                    t=1;
            }
            z=i;
        }
        if(t==1)
            System.out.println(n+" is NOT Circular Prime Number");
        else
            System.out.println(n+" is Circular Prime Number");
    }
}