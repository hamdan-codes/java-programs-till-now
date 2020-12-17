class Recur
{
    static int a,b,c;
    public static void main()
    {
        a=28;
        b=9;
        int ans=gcd(a,b);
        System.out.println("GCD = "+ans);
    }
    public static int gcd(int x,int y)
    {
        if((x%y)!=0)
            return gcd(y,x%y);
        else
            return y;
    }
}
