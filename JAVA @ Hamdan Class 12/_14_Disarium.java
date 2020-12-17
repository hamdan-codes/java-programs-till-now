class _14_Disarium
{
    public static void main(int n)
    {
        int m=n,n1=n;
        int k=0;
        int a=0,b=0;int ans=0;
        while(n1>0)
        {
            k++;
            n1=n1/10;
        }
        while(n>0)
        {
            a=n%10;
            b=(int)(Math.pow(a,k));
            k--;
            n=n/10;
            ans=ans+b;
        }
        if(ans==m)
            System.out.println(m+" is a Disarium Number");
        else
            System.out.println(m+" is NOT a Disarium Number");
    }
}