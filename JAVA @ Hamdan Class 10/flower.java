class flower
{
    flower(int a)
    {
        int z= a*a;
    System.out.println("The area of square is "+z);
    System.out.println("Thank You for Using");
  }
  flower(int a, int b)
    {
        int z= (a*b)/2;
    System.out.println("The area of triangle is "+z);
    System.out.println("Thank You for Using");
  }
  flower(int a,int b,int c)
    {
        int z= ((a*b)+(a*c)+(b*c));
        System.out.println("The total surface area of the cuboid is "+z);
        System.out.println("Thank You for Using");
  }
}