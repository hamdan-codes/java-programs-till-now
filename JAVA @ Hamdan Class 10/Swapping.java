import java.io.*;
class Swapping
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter The First Number for Swapping");
        int f = Integer.parseInt(br.readLine());
        System.out.println("Please Enter The Second Number for Swapping");
        int s = Integer.parseInt(br.readLine());
        f=f+s;
        s=f-s;
        f=f-s;
        System.out.println("After Swapping :");
        System.out.println("First Number = "+f);
        System.out.println("Second Number = "+s);
        System.out.println("Thank You for Using");
    }
}
