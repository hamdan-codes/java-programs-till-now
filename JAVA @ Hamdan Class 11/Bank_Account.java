import java.io.*;
class Bank_Account
{
    String name;
    long accn;
    int bal;
    int d=0,w=0;
    Bank_Account()
    {
        name="";
        accn=0;
        bal=0;
    }
    void Deposit()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your Name        : ");
        name=br.readLine();
        System.out.print("Input Account Number   : ");
        accn=Long.parseLong(br.readLine());
        System.out.print("Input Deposited Amount : ");
        d=Integer.parseInt(br.readLine());
        bal=bal+d;
    }
    void Withdraw()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Withdrawed Amount : ");
        w=Integer.parseInt(br.readLine());
        int q=bal-w;
        System.out.println();
        if(q>=0)
        {
            bal=bal-w;
            System.out.println("Amount Withdrawed.");
        }
        else
        {
            System.out.println("Amount Not Withdrawed due to Low Balance !!!");
            w=0;
        }
        System.out.println();
    }
    void Display()
    {
        System.out.println("Name of Depositor :     "+name);
        System.out.println("Account Number    :     "+accn);
        System.out.println("Amount Deposited  : Rs. "+d);
        System.out.println("Amount Withdrawn  : Rs. "+w);
        System.out.println("Amount Balance    : Rs. "+bal);
    }
    public static void main(String args[])throws IOException
    {
        Bank_Account ob =new Bank_Account();
        ob.Deposit();
        ob.Withdraw();
        ob.Display();
    }
}
