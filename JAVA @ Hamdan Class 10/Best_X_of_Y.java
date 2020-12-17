import java.io.*;
class Best_X_of_Y
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter First Choice  : ");
        String f=br.readLine();
        System.out.print("Enter Second Choice : ");
        String s=br.readLine();
        System.out.print("Loading Please Wait       ");
         int r=(int)(Math.random()*10);
        for(int a=1;a<1000000000;a++)
        {}
        System.out.print(" *");
        for(int a=1;a<1000000000;a++)
        {}
        System.out.print(" *");
        for(int a=1;a<1000000000;a++)
        {}
        System.out.print(" *");
        for(int a=1;a<1000000000;a++)
        {}
        System.out.print(" *");
        for(int a=1;a<1000000000;a++)
        {}
        System.out.print(" *");
        for(int a=1;a<1000000000;a++)
        {}
        System.out.println();
        if(r<=4)
            System.out.println("Winner is First Choice :  "+f);
        else
            System.out.println("Winner is Second Choice :  "+s);
    }
}