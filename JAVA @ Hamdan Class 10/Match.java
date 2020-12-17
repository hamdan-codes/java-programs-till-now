import java.io.*;
class Match
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int a=7,b=0,r=0,tr=0;
        int z[]=new int[2];
        for(int g=1;g<=2;g++)
        {
            System.out.println("  Play");
            tr=0;
            a=7;
            for(int h=1;h<a;h++)
            {
                System.out.print("Enter the run : ");
                r=Integer.parseInt(br.readLine());
                tr=tr+r;
                if(r==5)
                {
                    a++;
                    tr=tr+1;
                }
            }
            z[g-1]=tr;
        }
        System.out.println();
        System.out.println();
        System.out.println("Team 1 score : "+z[0]);
        System.out.println("Team 2 score : "+z[1]);
        if(z[0]>z[1])
            System.out.println("                         Winner is Team 1 ");
        else if(z[1]>z[0])
            System.out.println("                         Winner is Team 2");
        else
            System.out.println("Match tied");
    }
}