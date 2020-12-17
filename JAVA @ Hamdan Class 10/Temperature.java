import java.io.*;
class Temperature
{
    public static void main(String args[])throws IOException
    {
        BufferedReader tem=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the temperature converter");
        System.out.println("1. From Fahrenheit to Celcius");
        System.out.println("2. From Celcius to Fahrenheit");
        int w=Integer.parseInt(tem.readLine());
        switch(w)
        {
        case 1:
        {
        System.out.println("Write Temperature in Degree Fahrenheit");
        double f=Integer.parseInt(tem.readLine());
        double c=((f-32)/9)*5;
        System.out.println("The temperature for "+f+" degree Fahrenheit is "+c+" degree Celcius");
        break;
    }
    case 2:
        {
        System.out.println("Write Temperature in Degree Celcius");
        double c=Integer.parseInt(tem.readLine());
        double f=((c*9)/5)+32;
        System.out.println("The temperature for "+c+" degree Celcius is "+f+" degree Fahrenheit");
        break;
    }
    default:
    System.out.println("Wrong Choice");
    }
    System.out.println("Thank You for Using");
}
}