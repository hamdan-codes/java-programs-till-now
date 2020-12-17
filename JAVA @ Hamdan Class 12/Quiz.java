import java.io.*;
class Quiz
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter of Participants : ");
        int n=Integer.parseInt(br.readLine());
        char ch[][]=new char[n][5];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Partcipant "+(i+1)+" Answers : ");
            for(int j=0;j<5;j++)
            {
                System.out.print("Q. "+(j+1)+" = ");
                ch[i][j]=(char)br.read();
                char cccc=(char)br.read();
            }
        }
        System.out.println("Enter Key : ");
        char k[]=new char[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("Q. "+(i+1)+" : ");
            k[i]=(char)br.read();
            char cccc=(char)br.read();
        }
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(ch[i][j]);
            }
        }
    }
}
