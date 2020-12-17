class _10_Dec_to_Bin
{
    public static void main(int n)
    {
        int m=n;
        String b="",b1="",g="";
        int a=0,i=0,j=0;
        char c;
        while(n!=0)
        {
            a=n%2;
            b=a+b;
            n=n/2;
        }
        System.out.println("Binary Equivalent to "+m+" is "+b);
    }
}
