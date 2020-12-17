public class pub
{
    int a,b;
    double c;
    void publ(int a)
    {
        int ans=a*a;
        System.out.println("Area of Square = "+ans);
    }
    void pubm(int a,int b)
    {
        int ans=a*b;
        System.out.println("Area of Rectangle = "+ans);
    }
    void pubn(double c)
    {
        double ans=22*c*c/7;
        System.out.println("Area of Circle = "+ans);
    }
    public static void main(int sq,int l,double r)
    {
        int a=sq,b=l;
        double c=r;
        pub ob=new pub();
        ob.publ(a);
        ob.pubm(a,b);
        ob.pubn(c);
    }
}
