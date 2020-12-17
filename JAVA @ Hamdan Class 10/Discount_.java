import java.io.*;
class Discount_
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the Distance You travelled in KMs");
        float d=Float.parseFloat(br.readLine());
        System.out.println("Please Enter the Rate for 1 KM distance");
        float r=Float.parseFloat(br.readLine());
        float am= d*r;
        System.out.println("Females will get discount.");
        System.out.println("1. Female");
        System.out.println("2. Male");
        System.out.println("Enter Your Option");
        float g = Float.parseFloat(br.readLine());
        if(g==1)
        {
            System.out.println("Enter the Discount rate in percentage");
            float dr = Float.parseFloat(br.readLine());
            float dc= (dr*am)/100;
            am=am-dc;
            System.out.println("After Discount Amount Outstanding is  Rs. "+am);
        }
        else if(g==2)
        {
            am=am;
            System.out.println("Amount is  Rs. "+am);
        }
        else
            System.out.println("Wrong Choice");
    }
}
