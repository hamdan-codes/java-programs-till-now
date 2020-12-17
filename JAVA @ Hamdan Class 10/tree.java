import java.io.*;
class tree
{
    public static void main (String args[])throws IOException
    {
        BufferedReader ft=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Area of SQUARE");
        System.out.println("2. Area of Triangle");
        System.out.println("3. Total Surface area of Cuboid");
        int s = Integer.parseInt(ft.readLine());
        switch(s)
        {
            case 1:
            {
                System.out.println("Please enter the side");
                int a=Integer.parseInt(ft.readLine());
                flower obj = new flower (a);
                break;
            }
            case 2:
            {
                System.out.println("Please enter the Length");
                int a=Integer.parseInt(ft.readLine());
                System.out.println("Please enter the Breadth");
                int b=Integer.parseInt(ft.readLine());
                flower obj1= new flower (a,b);
                break;
            }
            case 3:
            {
                System.out.println("Please enter the Length");
                int a=Integer.parseInt(ft.readLine());
                System.out.println("Please enter the Breadth");
                int b=Integer.parseInt(ft.readLine());
                System.out.println("Please enter the Height");
                int c=Integer.parseInt(ft.readLine());
                flower obj2= new flower (a,b,c);
                break;
            }
            default:
            System.out.println("Wrong choice");
        }
    }
}