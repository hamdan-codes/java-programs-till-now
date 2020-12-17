import java.io.*;
class Calculator
{
     public static void main(String args[])throws IOException
     {
         BufferedReader ham=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Please Enter Your Choice ");
         System.out.println("1 Addition");
         System.out.println("2 Subtraction");
         System.out.println("3 Multiplication");
         System.out.println("4 Division");
         float  ans = 0;
         float c=Float.parseFloat(ham.readLine());
         System.out.println("Please Enter  first  value");
         float  m = Float.parseFloat(ham.readLine());
         System.out.println("Please Enter  second  value");
         float n =  Float.parseFloat(ham.readLine());

         if (c==1)
         {
              System.out.println("Welcome to  Addition");
              ans = m+n;
         }

         else if(c == 2)
         {
              System.out.println("Welcome to Subtraction ");
              ans = m-n;
         }

         else if (c==3)
         {
             System.out.println("Welcome to  Multiplication");
             ans = m*n;
         }

         else if(c==4)
         {
            System.out.println("Welcome to  Division");
            ans = m/n;
         }

         else
         {
            System.out.println("O! O!  Invalid choice !! Can not find the answer ");
         }

         System.out.println("Your Answer is "+ans) ;
         System.out.println("Thank You for Using");
       }
}
