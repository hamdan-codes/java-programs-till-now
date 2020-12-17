import java.io.*;
public class  IO 
{
    static String fileName = ("names.txt");
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader stdin = new BufferedReader(isr);
    public static void main(String args[])
    {
        try
        {
            FileWriter fw=new FileWriter(fileName);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter outFile= new PrintWriter(bw);
            for(int i =0;i<5;i++)
            {
                System.out.print("Enter Name : ");
                String name= stdin.readLine();
                outFile.println(name);
            }
            outFile.close();
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}
