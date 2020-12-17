class Mobius
{
    public static void main(int n)
    {
        double ans=0.0,d=0.0,e=0.0;
        int p=0,k=0,c=0,m=n;
        if(n==1)
            ans=1.0;
        else
        {
            for(int i=2;i<=n;i++)
            {
                k=0;
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                        k++;
                }
                if(k==0&&(m%i==0))
                {
                    p++;
                    m=m/i;
                }
                if(m%i==0)
                {
                    c=1;
                    break;
                }
            }
            if(c==1)
                ans=0.0;
            else if(c==0)
                ans=Math.pow(-1,p);
        }
        System.out.println("M("+n+") = "+ans);
    }
}