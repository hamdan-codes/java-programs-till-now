import java.io.*;
class Power_Root
{
    public static void main(String args[])throws IOException
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("1. Power");
     System.out.println("2. Under Root");
     int s=Integer.parseInt(br.readLine());
     switch(s)
     {
       case 1:
       {
        System.out.println("Please Enter the number of which You Want power");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Please Enter the power");
        int b=Integer.parseInt(br.readLine());
        double n = Math.pow(a,b);
        System.out.println(n);
        break;
       }
       case 2:
       {
        System.out.println("Please Enter the number of which You Want Square Root");
        int a=Integer.parseInt(br.readLine());
        double n = Math.sqrt(a);
        System.out.println(n);
        break;
       }
       default:
       System.out.println("Wrong Choice");
     }
    }
}