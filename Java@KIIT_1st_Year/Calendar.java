import java.io.*;
class Calendar
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int year,y2020=3,c=0,diff=0,y=2020,a=0,s=3;
        System.out.print("Enter year : ");
        year=Integer.parseInt(br.readLine());
        if(year<2020)
        {
            while(y!=year)
            {
                y--;
                if(((y%4==0)&&(y%100!=0))||(y%400==0))
                    y2020-=2;
                else
                    y2020--;
            }
            a=y2020%7;
            if(a==0)
                s=0;
            else if(a<0)
                s=a+7;
        }
        else if(year>2020)
        {
            while(y!=year)
            {
                if(((y%4==0)&&(y%100!=0))||(y%400==0))
                    y2020+=2;
                else
                    y2020++;
                y++;
            }
            s=y2020%7;
        }
        
        for(int i=1;i<=12;i++)
        {
            
        }
    }
}















