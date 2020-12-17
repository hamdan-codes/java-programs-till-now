import java.io.*;
class sum
{
    public static void main(String args[])throws IOException
    {
      BufferedReader ham=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Please Enter The Number You Want To Find The Sum  ''FROM'' ");
      int f=Integer.parseInt(ham.readLine());
      System.out.println("''TO'' ");
      int t=Integer.parseInt(ham.readLine());
      int a=0, b=0, c=0;
      a=(f*(f+1))/2;
      b=(t*(t+1))/2;
      c=((b-a)+f);
      System.out.println("The sum of numbers from " +f+" to " +t+" = " +c);
     System.out.println("Thank You for Using");
    }
}