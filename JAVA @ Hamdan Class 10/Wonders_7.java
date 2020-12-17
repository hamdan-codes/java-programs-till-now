import java.io.*;
class Wonders_7
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String w[]= {"CHICHEN ITZA", "CHRIST THE REDEEMER","TAJ MAHAL","GREAT WALL OF CHINA","MACHU PICCHU","PETRA","COLOSSEUM"};
        String c[]={"MEXICO","BRAZIL","INDIA","CHINA","PERU","JORDAN","ITALY"};
        System.out.println("Input : ");
        System.out.print("Country name : ");
        String s=br.readLine();
        s=s.toUpperCase();
        int a=0,b=-1;
        String s1="";
        for(a=0;a<7;a++)
        {
            if(c[a].equals(s))
            {
                b=a;
                break;
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("Output : ");
        if(b>=0)
            System.out.println(s+" - "+w[b]);
        else
            System.out.println("Sorry Not Found !!");
        System.out.println();
        System.out.println("Thank You ");
    }
}
