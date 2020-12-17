class overload2
{
    int a=5,b=6;
    double c=7;
    void overload85()
    {
        int t= a*b;
        System.out.println(" Area of rectangle = "+t);
    }
    void overload21()
    {
        int t= a*a;
        System.out.println(" Area of square = "+t);
    }
    void overload65()
    {
        double t= (22*c*c)/7;
        System.out.println(" Area of circle = "+t);
    }
    public static void main()
    {
        overload2 ob = new overload2();
        ob.overload85();
        ob.overload21();
        ob.overload65();
    }
}
