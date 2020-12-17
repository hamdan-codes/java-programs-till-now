class _5_Niven
{
    public static void main(int n)
    {
        int a=0,b=0,n1=n;
        while(n>0)
        {
            a=n%10;
            b=b+a;
            n=n/10;
        }
        
        if(n1%b==0)
            System.out.println(n1+" is a Niven Number ");
        else
            System.out.println(n1+" is NOT a Niven Number ");
    }
}
