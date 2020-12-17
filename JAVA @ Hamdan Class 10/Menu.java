import java.io.*;
class Menu
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Floyd 's Triangle ");
        System.out.println("2. ICSE Series ");
        System.out.println("3. Both");
        System.out.print("Enter your Choice : ");
        int s= Integer.parseInt(br.readLine());
        System.out.println();
        System.out.println("Output : ");
        System.out.println();
        String s2="";
        String s1="ICSE";
        int l=s1.length();
        switch(s)
        {
            case 1:
            {
                int a=1,b=1;
                for(int i=1;i<=5;i++)
                {
                    for(int j=a;j<=b;j++)
                    {
                        System.out.print(j+"\t");
                    }
                    a=a+i;
                    b=b+i+1;
                    System.out.println();
                    System.out.println();
                }
                break;
            }
            case 2:
            {
                int a=0,b=0;
                for(a=0;a<l;a++)
                {
                    s2="";
                    for(b=0;b<=a;b++)
                    {
                        char c=s1.charAt(b);
                        s2=s2+" "+c;
                    }
                    System.out.println(s2);
                }
                break;
            }
            case 3:
            {
                System.out.println("Floyd 's Triangle : ");
                System.out.println();
                int a=1,b=1;
                for(int i=1;i<=5;i++)
                {
                    for(int j=a;j<=b;j++)
                    {
                        System.out.print(j+"\t");
                    }
                    a=a+i;
                    b=b+i+1;
                    System.out.println();
                    System.out.println();
                }
                System.out.println();
                System.out.println("ICSE Series :");
                System.out.println();
                for(a=0;a<l;a++)
                {
                    s2="";
                    for(b=0;b<=a;b++)
                    {
                        char c=s1.charAt(b);
                        s2=s2+" "+c;
                    }
                    System.out.println(s2);
                }
                break;
            }
            default:
                System.out.println("Wrong Choice Try Again");
        }
        System.out.println();
        System.out.println("Thank You ");
    }
}
