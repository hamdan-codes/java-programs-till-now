class Date_Day
{
    public static void main(int dn,int yr,int N)
    {
        if(dn<1||dn>366||yr<1000||yr>9999||N<1||N>100)
        {
            System.out.println("Wrong Input ! ! ! ");
            System.out.println("Please Try Again ! ! ! ");
        }
        else
        {
            System.out.println("  INPUT :       DAY NUMBER : "+dn);
            System.out.println("                      YEAR : "+yr);
            System.out.println("            DATE AFTER (N) : "+N);
            System.out.println();
            System.out.println();
              System.out.print("OUTPUT :        ");
            Date_Day computer=new Date_Day();
            computer.practicalQuestion13(dn,yr);
            System.out.println();
            System.out.print("After "+N+" days : ");
            computer.practicalQuestion13((dn+N),yr);
        }
    }
    void practicalQuestion13(int dn,int yr)
    {
        int d=dn,f=28;
        if(yr%4==0)
            f=29;
        int day[]={31,f,31,30,31,30,31,31,30,31,30,31};
        String mon[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int i=0,date=0;
        String mo="";
        while(d>0)
        {
            if(i>11)
            {
                i=i-12;
                yr++;
            }
            if(yr%4==0)
                day[1]=29;
            if(d>day[i])
                d=d-day[i];
            else
            {
                date=d;
                mo=mon[i];
                break;
            }
            i++;
        }
        System.out.println("Date : "+date+" "+mo+" "+yr);
    }
}
