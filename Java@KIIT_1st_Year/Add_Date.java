import java.io.*;
class Add_Date
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,dd,mm,yy,c=1;
        System.out.println("Enter date, first enter day then month and then year : ");
        dd=Integer.parseInt(br.readLine());
        mm=Integer.parseInt(br.readLine());
        yy=Integer.parseInt(br.readLine());
        if((dd>=0&&dd<=31&&(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12))||(dd>=0&&dd<=30&&(mm==4||mm==6||mm==9||mm==11))||(dd>=0&&dd<=28&&mm==2)||(dd>=0&&dd<=29&&mm==2&&yy%4==0))
        {
            System.out.print("Enter number of days to add : ");
            n=Integer.parseInt(br.readLine());
            while(c<=n)
            {
                dd++;
                if(((dd==29&&mm==2&&yy%4!=0)||(dd==30&&mm==2&&yy%4==0))||(dd==31&&(mm==4||mm==6||mm==9||mm==11))||(dd==32&&(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12)))
                {
                    mm++;
                    dd=1;
                }
                
                if(mm==13)
                {
                    yy++;
                    mm=1;
                }
                c++;
            }
            System.out.println("Date after "+n+" days : "+dd+" : "+mm+" : "+yy);
        }
        else
            System.out.println("Wrong Input ... Please Try Again !!!");
    }
}
