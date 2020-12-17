class Fibo
{
    String result(int a,int b,int m,int n)
    {
        int s=a+b;
        if(m<=n)
            return s+"  "+(result(b,s,m+1,n));
        else
            return "  ";
    }
    public static void main(int n)
    {
        System.out.print("0  1  ");
        Fibo ob=new Fibo();
        String res=ob.result(0,1,1,n);
        System.out.print(res);
    }
}