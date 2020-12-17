class overload1
{
    int a=6,b=7;
    double c=14;
    void over1()
    {
        int t= a*b;
        System.out.println(" Area of rectangle = "+t);
    }
    void over2()
    {
        int t= a*a;
        System.out.println(" Area of square = "+t);
    }
    void over3()
    {
        double t= (22*c*c)/7;
        System.out.println(" Area of circle = "+t);
    }
    public static void main()
    {
        overload1 ob = new overload1();
        ob.over1();
        ob.over2();
        ob.over3();
    }
}
