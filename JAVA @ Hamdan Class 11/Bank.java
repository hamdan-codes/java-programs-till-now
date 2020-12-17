import java.io.*;
class Bank
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your Amount (upto or less than 5 digits)   and DO NOT enter ones digit as 0: ");
        int amt=Integer.parseInt(br.readLine());
        int tot=amt;
        int tn=0,ta=0,k=0,d=10000;
        System.out.println();
        System.out.print("Amount :  ");
        while(tot>0)
        {
            if((tot/d)>0)
            {
                if((tot/d)==1)
                    System.out.print("ONE  ");
                if((tot/d)==2)
                    System.out.print("TWO  ");
                if((tot/d)==3)
                    System.out.print("THREE  ");
                if((tot/d)==4)
                    System.out.print("FOUR  ");
                if((tot/d)==5)
                    System.out.print("FIVE  ");
                if((tot/d)==6)
                    System.out.print("SIX  ");
                if((tot/d)==7)
                    System.out.print("SEVEN  ");
                if((tot/d)==8)
                    System.out.print("EIGHT  ");
                if((tot/d)==9)
                    System.out.print("NINE  ");
                k=1;
                tot=tot%d;
            }
            else if(((tot/d)==0)&&(k==1))
            {
                if((tot/d)==0)
                    System.out.print("ZERO  ");
                tot=tot%d;
            }
            d=d/10;
        }
        System.out.println();
        System.out.println();
        if((amt/100000)==0)
        {
            if((amt/1000)>9)
            {
                System.out.println("1000 x "+(amt/1000)+" = "+(1000*(amt/1000)));
                tn=tn+(amt/1000);
                ta=ta+(1000*(amt/1000));
                amt=amt%1000;
            }
            else if(((amt/1000)<10)&&((amt/1000)>0))
            {
                System.out.println("1000 x  "+(amt/1000)+" =  "+(1000*(amt/1000)));
                tn=tn+(amt/1000);
                ta=ta+(1000*(amt/1000));
                amt=amt%1000;
            }
            if((amt/500)>0)
            {
                System.out.println(" 500 x  "+(amt/500)+" =   "+(500*(amt/500)));
                tn=tn+(amt/500);
                ta=ta+(500*(amt/500));
                amt=amt%500;
            }
            if((amt/100)>0)
            {
                System.out.println(" 100 x  "+(amt/100)+" =   "+(100*(amt/100)));
                tn=tn+(amt/100);
                ta=ta+(100*(amt/100));
                amt=amt%100;
            }
            if((amt/50)>0)
            {
                System.out.println("  50 x  "+(amt/50)+" =    "+(50*(amt/50)));
                tn=tn+(amt/50);
                ta=ta+(50*(amt/50));
                amt=amt%50;
            }
            if((amt/20)>0)
            {
                System.out.println("  20 x  "+(amt/20)+" =    "+(20*(amt/20)));
                tn=tn+(amt/20);
                ta=ta+(20*(amt/20));
                amt=amt%20;
            }
            if((amt/10)>0)
            {
                System.out.println("  10 x  "+(amt/10)+" =    "+(10*(amt/10)));
                tn=tn+(amt/10);
                ta=ta+(10*(amt/10));
                amt=amt%10;
            }
            if((amt/5)>0)
            {
                System.out.println("   5 x  "+(amt/5)+" =     "+(5*(amt/5)));
                tn=tn+(amt/5);
                ta=ta+(5*(amt/5));
                amt=amt%5;
            }
            if((amt/2)>0)
            {
                System.out.println("   2 x  "+(amt/2)+" =     "+(2*(amt/2)));
                tn=tn+(amt/2);
                ta=ta+(2*(amt/2));
                amt=amt%2;
            }
            if((amt/1)>0)
            {
                System.out.println("   1 x  "+(amt/1)+" =     "+(1*(amt/1)));
                tn=tn+(amt/1);
                ta=ta+(1*(amt/1));
                amt=amt%1;
            }
            System.out.println();
            System.out.println("TOTAL AMOUNT        =  Rs. "+ta);
            System.out.println("TOTAL NO. OF NOTES  =        "+tn);
        }
        else
        {
            System.out.println("Too Big Amount Entered !!!");
            System.out.println("You were supposed to Enter Amount upto or less than 5 gigits");
            System.out.println("Please Try Again.......");
        }
    }
}










