import java.io.*;
class Alarm
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter after how much time (in hh:mm format) should the alarm go :");
        String time=br.readLine();
        System.out.println(java.time.LocalTime.now());
        
    }
}