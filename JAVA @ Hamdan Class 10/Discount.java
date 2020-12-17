import java.io.*;
class Discount
{
    public static void main(String args[])throws IOException
    {
        BufferedReader dis= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the total cost in Rs.");
        int t= Integer.parseInt(dis.readLine());
        int m=0;
        if (t<=2000)
        {
            m=t-((5*t)/100);
            System.out.println("Total money that You have to give is Rs. "+m);
        }
        else if ((t>=2001)&&(t<=5000))
        {
            m=t-((25*t)/100);
            System.out.println("Total money that You have to give is Rs. "+m);
        }
        else if ((t>=5001)&&(t<=10000))
        {
            m=t-((35*t)/100);
            System.out.println("Total money that You have to give is Rs. "+m);
        }
        else 
        {
            m=t-((50*t)/100);
            System.out.println("Total money that You have to give is Rs. "+m);
        }
        System.out.println("Thank You for Using");
    }
}