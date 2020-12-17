import java.io.*;
class Day_month
{
    public static void main(String args[])throws IOException
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The menu ........ names ");
        System.out.println("1 Days name from Sunday");
        System.out.println("2 Days name from Monday");
        System.out.println("3 Months name");
        System.out.println("4 All");
        System.out.println("Please Enter your choice");
        int s =Integer.parseInt(sc.readLine());
        switch(s)
        {
            case 1:
            {
                System.out.println("Sunday");
                System.out.println("Monday");
                System.out.println("Tuesday");
                System.out.println("Wednesday");
                System.out.println("Thursday");
                System.out.println("Friday");
                System.out.println("Saturday");
                break;
            }
             case 2:
             {
                System.out.println("Monday");
                System.out.println("Tuesday");
                System.out.println("Wednesday");
                System.out.println("Thursday");
                System.out.println("Friday");
                System.out.println("Saturday");
                System.out.println("Sunday");
                break;
            }
             case 3:
            {
                System.out.println("January");
                System.out.println("February");
                System.out.println("March");
                System.out.println("April");
                System.out.println("May");
                System.out.println("June");
                System.out.println("July");
                System.out.println("August");
                System.out.println("September");
                System.out.println("October");
                System.out.println("November");
                System.out.println("December");
                break;
            }
            case 4:
            {
                System.out.println("Days name from Sunday");
                System.out.println("");
                System.out.println("Sunday");
                System.out.println("Monday");
                System.out.println("Tuesday");
                System.out.println("Wednesday");
                System.out.println("Thursday");
                System.out.println("Friday");
                System.out.println("Saturday");
                System.out.println("");
                System.out.println("Days name from Monday");
                System.out.println("");
                System.out.println("Monday");
                System.out.println("Tuesday");
                System.out.println("Wednesday");
                System.out.println("Thursday");
                System.out.println("Friday");
                System.out.println("Saturday");
                System.out.println("Sunday");
                System.out.println("");
                System.out.println("Month' s name");
                System.out.println("");
                System.out.println("January");
                System.out.println("February");
                System.out.println("March");
                System.out.println("April");
                System.out.println("May");
                System.out.println("June");
                System.out.println("July");
                System.out.println("August");
                System.out.println("September");
                System.out.println("October");
                System.out.println("November");
                System.out.println("December");
                break;
            }
            default:
             {
                System.out.println("Default Case");
            }
        }
         System.out.println("Thank You for Using");
    }
}