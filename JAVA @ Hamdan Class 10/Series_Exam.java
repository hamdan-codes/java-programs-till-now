class Series_Exam
{
    void SumSeries(int n,double x)
    {
        double s=0;
        for(int a=1;a<=n;a++)
        {
            if(a%2==0)
                s=s-(x/a);
            else
                s=s+(x/a);
        }
        System.out.println("Sum of the Series = "+s);
    }
    
    void SumSeries()
    {
        long s=0;
        long b=1;
        for(int a=1;a<=20;a++)
        {
            b=b*a;
            s=s+b;
        }
        System.out.println("Sum of the Series = "+s);
    }
    
    public static void main(int n1,double x1)
    {
        int n=n1;
        double x=x1;
        Series_Exam obj=new Series_Exam();
        obj.SumSeries(n,x);
        obj.SumSeries();
        System.out.println();
        System.out.println("Thank You ");
    }
}
