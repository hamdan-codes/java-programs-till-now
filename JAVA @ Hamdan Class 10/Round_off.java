import java.io.*;
class Round_off
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the number for its Round off");
        int n= Integer.parseInt(br.readLine());
        System.out.println("Please Enter the nearest choice from the choice given");
        System.out.println("1. Nearest ten");
        System.out.println("2. Nearest hundred");
        System.out.println("3. Nearest thousand");
        System.out.println("4. Nearest ten thousand");
        int c= Integer.parseInt(br.readLine());
        switch(c)
        {
            case 1:
            {
                int a = n%10;
                if(a>=5)
                {
                    int aa= ((n/10)*10)+10;
                    System.out.println(aa);
                }
                else
                {
                    int aa= ((n/10)*10);
                    System.out.println(aa);
                }
                break;
            }
             case 2:
            {
                int a = n%100;
                if(a>=50)
                {
                    int aa= ((n/100)*100)+100;
                    System.out.println(aa);
                }
                else
                {
                    int aa= ((n/100)*100);
                    System.out.println(aa);
                }
                break;
            }
            case 3:
            {
                int a = n%1000;
                if(a>=50)
                {
                    int aa= ((n/1000)*1000)+1000;
                    System.out.println(aa);
                }
                else
                {
                    int aa= ((n/1000)*1000);
                    System.out.println(aa);
                }
                break;
            }
            case 4:
            {
                int a = n%10000;
                if(a>=50)
                {
                    int aa= ((n/10000)*10000)+10000;
                    System.out.println(aa);
                }
                else
                {
                    int aa= ((n/10000)*10000);
                    System.out.println(aa);
                }
                break;
            }
            default:
            {
                System.out.println("Wrong choice");
            }
    }
    System.out.println("Thank You for Using");
}
}