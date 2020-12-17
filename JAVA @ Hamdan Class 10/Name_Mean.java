import java.io.*;
class Name_Mean
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Enter the Name : ");
        String n= br.readLine();
        n=n.toUpperCase();
        int l=n.length();
        int a=0,b=0;
        char c,d;
        System.out.println();
        System.out.println("Calculating Meaning of "+n);
        for(int aa=1;aa<=5;aa++)
        {
            for(int bb=0;bb<=1000000000;bb++)
            {}
            System.out.print("  *");
        }
        System.out.println();
        for(a=0;a<l;a++)
        {
            c=n.charAt(a);
            for(int bb=0;bb<=1000000000;bb++)
            {}
            
            switch(c)
            {
                case 'A':
                    System.out.println(c+" :  Affectionate");
                    break;
                case 'B':
                    System.out.println(c+" :  Brave");
                    break;
                case 'C':
                    System.out.println(c+" :  Colourful");
                    break;
                case 'D':
                    System.out.println(c+" :  Decent");
                    break;
                case 'E':
                    System.out.println(c+" :  Exciting");
                    break;
                case 'F':
                    System.out.println(c+" :  Fascinate");
                    break;
                case 'G':
                    System.out.println(c+" :  Gorgeous");
                    break;
                case 'H':
                    System.out.println(c+" :  Honest");
                    break;
                case 'I':
                    System.out.println(c+" :  Intelligent");
                    break;
                case 'J':
                    System.out.println(c+" :  Jolly");
                    break;
                case 'K':
                    System.out.println(c+" :  Kind");
                    break;
                case 'L':
                    System.out.println(c+" :  Lonely");
                    break;
                case 'M':
                    System.out.println(c+" :  Modest");
                    break;
                case 'N':
                    System.out.println(c+" :  Negative");
                    break;
                case 'O':
                    System.out.println(c+" :  Optimistic");
                    break;
                case 'P':
                    System.out.println(c+" :  Pathetic");
                    break;
                case 'Q':
                    System.out.println(c+" :  Quick");
                    break;
                case 'R':
                    System.out.println(c+" :  Realist");
                    break;
                case 'S':
                    System.out.println(c+" :  Sophisticated");
                    break;
                case 'T':
                    System.out.println(c+" :  Talent");
                    break;
                case 'U':
                    System.out.println(c+" :  Unlucky");
                    break;
                case 'V':
                    System.out.println(c+" :  Vivid");
                    break;
                case 'W':
                    System.out.println(c+" :  Weak");
                    break;
                case 'X':
                    System.out.println(c+" :  Xanthippe");
                    break;
                case 'Y':
                    System.out.println(c+" :  Youthful");
                    break;
                case 'Z':
                    System.out.println(c+" :  Zealous");
                    break;
                default:
                    System.out.println();
            }
        }
    }
}
