import java.io.*;
class leap
{
    public static void main(String args[])throws IOException
    {
        BufferedReader le= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. leap");
        System.out.println("2. your age check");
        System.out.println("Please enter the option");
        int s= Integer.parseInt(le.readLine());
        switch(s)
        {
            case 1:
            {
             System.out.println("Please enter the year for leap check");
             int l=Integer.parseInt(le.readLine());
             year obj= new year(l);
             break;
            }
            case 2:
            {
                System.out.println("Please enter the year Of your DOB for age check");
                 int d=Integer.parseInt(le.readLine());
                 System.out.println("Please enter the present year");
                 int p=Integer.parseInt(le.readLine());
                 year obj1= new year(d,p);
                 break;
            }
                default:
                System.out.println("Wrong choice");
            }
        }
    }
    