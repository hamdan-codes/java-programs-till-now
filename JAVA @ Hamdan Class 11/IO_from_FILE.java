import java.io.*;
class IO_from_FILE
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Enter the Name : ");
        String s=br.readLine();
        FileWriter abc=new FileWriter("School.txt");
        BufferedWriter pqr=new BufferedWriter(abc);
        PrintWriter mno=new PrintWriter(pqr);
        mno.println("Hello");
        mno.println(s);
        mno.close();
    }
}