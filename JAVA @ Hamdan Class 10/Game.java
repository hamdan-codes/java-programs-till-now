import java.io.*;
class Game
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int a= (int)(Math.random()*10);
        char ch='a';
        if(a==1)
            ch='!';
        else if(a==2)
            ch='@';
        else if(a==3)
            ch='#';
        else if(a==4)
            ch='$';
        else if(a==5)
            ch='%';
        else if(a==6)
            ch='^';
        else if(a==7)
            ch='&';
        else if(a==8)
            ch='*';
        else if(a==9)
            ch='(';
        else if(a==0)
            ch=')';
        System.out.println("Rules: <=10 persons are required.\n\tEach person shoud enter his/her choice(0,1,2,3,4,5,6,7,8,9 "+ch+")\n\tEach person should pay Rs. 10\n\tWinning persons(s) will get 40% of total amount collected.");
        System.out.print("Do not Choose same Number for two Participants");
        System.out.println();
        System.out.print("Number of Participants : ");
        int l= Integer.parseInt(br.readLine());
        int zz=(-1);
        String n[]=new String[l];
        int c[]=new int[l];
        System.out.println("Welcome to the Game");
        for(int aa= 0;aa<l;aa++)
        {
            System.out.print("Name : ");
            n[aa]=br.readLine();
            System.out.print("Choice : ");
            c[aa]=Integer.parseInt(br.readLine());
        }
        for(int aa= 0;aa<l;aa++)
        {
            if(c[aa]==a)
            {
                zz=aa;
            }
        }
        if(zz>=0)
        {
            System.out.println("Winner is :    '"+n[zz]+"' with Number :    '"+c[zz]+"'");
        }
        else
        {
            System.out.println("No Winner . . . . .");
            System.out.println("Winner Number was  '"+a+"'");
        }
       
    }
}
