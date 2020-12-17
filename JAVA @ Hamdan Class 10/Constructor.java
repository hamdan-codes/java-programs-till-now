import java.io.*;
class Constructor
{
    Constructor(int s)
    {
        int ans=s*s;
        System.out.println("Area of Square = "+ans);
    }
    Constructor(int l,int b)
    {
        int ans=l*b;
        System.out.println("Area of Rectangle = "+ans);
    }
    public static void main(int side,int length,int breadth)
    {
        int s=side;
        int l=length;
        int b=breadth;
        Constructor obj= new Constructor(s);
        Constructor obj1= new Constructor(l,b);
    }
}
