class _19_Kaprekar
{
    public static void main(int n)
    {
        int m=n;
        int sq=n*n;
        int k=0;
        double a=0,b=0;
        int sq1=sq;
        while(sq1>0)
        {
            k++;
            sq1=sq1/10;
        }
        n=m;
        int k2=k/2;
        if(k%2==0)
        {
            a=sq/((int)(Math.pow(10,k2)));
            b=sq%((int)(Math.pow(10,k2)));
        }
        else
        {
            a=sq/((int)(Math.pow(10,(k2+1))));
            b=sq%((int)(Math.pow(10,(k2+1))));
        }
        int i=(int)a;
        int j=(int)b;
        int s=i+j;
        System.out.println();
        if(s==m)
            System.out.println(m+" is a Kaprekar Number");
        else
            System.out.println(m+" is NOT a Kaprekar Number");
        System.out.println();
        System.out.println("Square     = "+sq);
        System.out.println("Left part  = "+i);
        System.out.println("Right part = "+j);;
        System.out.println("Sum        = "+s);
    }
}
