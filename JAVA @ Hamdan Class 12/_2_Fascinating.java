class _2_Fascinating
{
    public static void main(int n)
    {
        int m=n,a,b,c,k=0;
        a=1*n;
        b=2*n;
        c=3*n;
        String s="";
        s=s+a+b+c;
        char d,e;
        int l=s.length();
        System.out.println(s);
        for(int i=0;i<l-1;i++)
        {
            d=s.charAt(i);
            for(int j=i+1;j<l;j++)
            {
                e=s.charAt(j);
                if(d==e)
                {
                    k=1;
                }
            }
        }
        if(k==1)
            System.out.println(n+" is NOT a Fascinating Number");
        else
            System.out.println(n+" is a Fascinating Number");
    }
}