import java.io.*;
class ParkingLot
{
    int vno,hours;
    double bill;
    void input()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter Vehicle no.");
        vno=Integer.parseInt(br.readLine());
        System.out.println("Please enter Hours");
        hours=Integer.parseInt(br.readLine());
    }
    void calculate()
    {
        if(hours==1)
            bill = 3;
        else
            bill= 3+(1.5*(hours-1));
    }
    void display()
    {
        System.out.println("Bill for vehicle number "+vno+" for "+hours+" hrs = "+bill);
    }
    public static void main(String args[])throws IOException
    {
        ParkingLot obj = new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
