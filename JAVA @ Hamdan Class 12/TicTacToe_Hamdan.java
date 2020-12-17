import java.io.*;
class TicTacToe_Hamdan
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Player Name : ");
        String f=br.readLine();
        String s="Computer";
        System.out.println("Player 1 = X = "+f);
        System.out.println("Player 1 = O = "+s);
        String w=s,ww="";
        int c=0,n=0,a=0,b=0,k=-1,z=0,p=2,pp=0,nw=0;
        char t[][]=new char[3][3];
        char cc;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                t[i][j]=' ';
            }
        }
                                          System.out.println("                          Indexes for the Ease of User...");
                                          System.out.println("   |   |                           |   |   ");
            System.out.println(" "+t[0][0]+" | "+t[0][1]+" | "+t[0][2]+"                       1 | 2 | 3 ");
                                          System.out.println("___|___|___                     ___|___|___");
                                          System.out.println("   |   |                           |   |   ");
            System.out.println(" "+t[1][0]+" | "+t[1][1]+" | "+t[1][2]+"                       4 | 5 | 6 ");
                                          System.out.println("___|___|___                     ___|___|___");
                                          System.out.println("   |   |                           |   |   ");
            System.out.println(" "+t[2][0]+" | "+t[2][1]+" | "+t[2][2]+"                       7 | 8 | 9 ");
                                          System.out.println("   |   |                           |   |   ");
        while(c<9)
        {
            if(z%2==0)
            {
                cc='X';
                ww=f;
                System.out.println(cc+"' s Chance  ");
                System.out.print(ww+"' s Chance : ");
                n=Integer.parseInt(br.readLine());
            }
            else 
            {
                n=(int)((Math.random())*10);
                cc='O';
                ww=s;
                
            }
            
            if(n==1)
            {
                a=0;
                b=0;
            }
            else if(n==2)
            {
                a=0;
                b=1;
            }
            else if(n==3)
            {
                a=0;
                b=2;
            }
            else if(n==4)
            {
                a=1;
                b=0;
            }
            else if(n==5)
            {
                a=1;
                b=1;
            }
            else if(n==6)
            {
                a=1;
                b=2;
            }
            else if(n==7)
            {
                a=2;
                b=0;
            }
            else if(n==8)
            {
                a=2;
                b=1;
            }
            else if(n==9)
            {
                a=2;
                b=2;
            }
            else
            {
                a=3;
                b=3;
            }
            if(b<0||b>=3||a<0||a>=3)
            {
                System.out.println("Unacceptable Index...Try Again...");
            }
            else if(t[a][b]==' '&&k==-1)
            {
                t[a][b]='X';
                k=k*(-1);
                c++;
                z++;
            }
            else if(t[a][b]==' '&&k==1)
            {
              if(b>=0&&b<3&&a>=0&&a<3)
              {
                System.out.println(cc+"' s Chance  ");
                System.out.print(ww+"' s Chance Please Let Computer make choice : ");
                for(int i=1;i<1000000000;i++)
                {}
                System.out.print("    *");
                for(int i=1;i<1000000000;i++)
                {}
                System.out.print("    *");
                for(int i=1;i<1000000000;i++)
                {}
                System.out.print("    *");
                for(int i=1;i<1000000000;i++)
                {}
                System.out.print("    *");
                System.out.println();
              }
                t[a][b]='O';
                k=k*(-1);
                c++;
                z++;
            }
            else if(t[a][b]!=' ')
            {
                System.out.println("Enter this Chance Again...Block aready used : ");
            }
                                          System.out.println("                          Indexes for the Ease of User...");
                                          System.out.println("   |   |                           |   |   ");
            System.out.println(" "+t[0][0]+" | "+t[0][1]+" | "+t[0][2]+"                       1 | 2 | 3 ");
                                          System.out.println("___|___|___                     ___|___|___");
                                          System.out.println("   |   |                           |   |   ");
            System.out.println(" "+t[1][0]+" | "+t[1][1]+" | "+t[1][2]+"                       4 | 5 | 6 ");
                                          System.out.println("___|___|___                     ___|___|___");
                                          System.out.println("   |   |                           |   |   ");
            System.out.println(" "+t[2][0]+" | "+t[2][1]+" | "+t[2][2]+"                       7 | 8 | 9 ");
                                          System.out.println("   |   |                           |   |   ");
            if(t[0][0]==t[0][1]&&t[0][0]==t[0][2]&&t[0][0]!=' ')
            {
                if(t[0][0]=='X')
                {
                    p=1;
                    w=f;
                }
                System.out.println(t[0][0]+" wins");
                System.out.println("Player "+p+" wins");
                System.out.println(w+" wins");
                nw=1;
                break;
            }
            if(t[1][0]==t[1][1]&&t[1][0]==t[1][2]&&t[1][0]!=' ')
            {
                if(t[1][0]=='X')
                {
                    p=1;
                    w=f;
                }
                System.out.println(t[1][0]+" wins ");
                System.out.println("Player "+p+" wins");
                System.out.println(w+" wins");
                nw=1;
                break;
            }
            if(t[2][0]==t[2][1]&&t[2][0]==t[2][2]&&t[2][0]!=' ')
            {
                if(t[2][0]=='X')
                {
                    p=1;
                    w=f;
                }
                System.out.println(t[2][0]+" wins ");
                System.out.println("Player "+p+" wins");
                System.out.println(w+" wins");
                nw=1;
                break;
            }
            if(t[0][0]==t[1][0]&&t[0][0]==t[2][0]&&t[0][0]!=' ')
            {
                if(t[0][0]=='X')
                {
                    p=1;
                    w=f;
                }
                System.out.println(t[0][0]+" wins ");
                System.out.println("Player "+p+" wins");
                System.out.println(w+" wins");
                nw=1;
                break;
            }
            if(t[0][1]==t[1][1]&&t[0][1]==t[2][1]&&t[0][1]!=' ')
            {
                if(t[0][1]=='X')
                {
                    p=1;
                    w=f;
                }
                System.out.println(t[0][1]+" wins ");
                System.out.println("Player "+p+" wins");
                System.out.println(w+" wins");
                nw=1;
                break;
            }
            if(t[0][2]==t[1][2]&&t[0][2]==t[2][2]&&t[0][2]!=' ')
            {
                if(t[0][2]=='X')
                {
                    p=1;
                    w=f;
                }
                System.out.println(t[0][2]+" wins ");
                System.out.println("Player "+p+" wins");
                System.out.println(w+" wins");
                nw=1;
                break;
            }
            if(t[0][0]==t[1][1]&&t[0][0]==t[2][2]&&t[0][0]!=' ')
            {
                if(t[0][0]=='X')
                {
                    p=1;
                    w=f;
                }
                System.out.println(t[0][0]+" wins ");
                System.out.println("Player "+p+" wins");
                System.out.println(w+" wins");
                nw=1;
                break;
            }
            if(t[0][2]==t[1][1]&&t[0][2]==t[2][0]&&t[0][2]!=' ')
            {
                if(t[0][2]=='X')
                {
                    p=1;
                    w=f;
                }
                System.out.println(t[0][2]+" wins ");
                System.out.println("Player "+p+" wins");
                System.out.println(w+" wins");
                nw=1;
                break;
            }
        }
        if(nw==0)
            System.out.println("No Winner......!!!!!!");
    }
}
