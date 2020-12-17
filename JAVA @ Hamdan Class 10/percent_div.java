import java.io.*;
class percent_div
{
    public static void main(String args[])throws IOException
    {
        BufferedReader per=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the total marks you obtained");
        int mo = Integer.parseInt(per.readLine());
        System.out.println("Please Enter the Total marks out of you got "+mo+" marks");
        int tm = Integer.parseInt(per.readLine());
        int p= ((mo*100)/tm);
        System.out.println("Your percentatage to the nearest once is "+p );
       
        if(p>=60)
        {
        System.out.println("You are FIRST Division");
    }
    else if((p>=40)&&(p<=59))
        {
        System.out.println("You are SECOND Division");
    }
    else if((p>=33)&&(p<=39))
        {
        System.out.println("You are THIRD Division");
    }

    else
    {
    System.out.println("You are FAIL");
}
    System.out.println("Thank You for Using");
    }
}