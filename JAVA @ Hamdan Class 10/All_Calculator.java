import java.io.*;
class All_Calculator
{
     public static void main(String args[])throws IOException
     {
         BufferedReader ham=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Please Enter Your Choice ");
         System.out.println("1 Addition");
         System.out.println("2 Subtraction");
         System.out.println("3 Multiplication");
         System.out.println("4 Division");
         System.out.println("5 Power");
         System.out.println("6 Square Root");
         System.out.println("7 Remainder");
         float  ans = 0;
         double ans1=0;
         float c=Float.parseFloat(ham.readLine());
         System.out.println("Please Enter  first  value(or Base)(or Number for Root)(or Dividend)");
         float  m = Float.parseFloat(ham.readLine());
         System.out.println("Please Enter  second  value(or Power)(or any Value for Root)");
         float n =  Float.parseFloat(ham.readLine());

         if (c==1)
         {
              System.out.println("Welcome to  Addition");
              ans = m+n;
         }

         else if(c==2)
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
         else if(c==5)
         {
            System.out.println("Welcome to  Power");
            ans1 = Math.pow(m,n);
         }
         else if(c==6)
         {
            System.out.println("Welcome to  Square Root");
            ans1 = Math.sqrt(m);
         }
         else if(c==7)
         {
            System.out.println("Welcome to  Remainder");
            ans = m%n;
         }

         else
         {
            System.out.println("O! O!  Invalid choice !! Can not find the answer ");
         }
         if((c==1)||(c==2)||(c==3)||(c==4)||(c==7))
             System.out.println("Your Answer is "+ans) ;
         if((c==5)||(c==6))
             System.out.println("Your Answer is "+ans1) ;
         System.out.println("Thank You for Using");
       }
}
