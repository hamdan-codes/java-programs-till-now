import java.io.*;
class practice
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a:");
        int a = Integer.parseInt(br.readLine());
        
        System.out.print("Enter b:");
        int b = Integer.parseInt(br.readLine());
        
        for(int i=0;i<a;i++)
        {
            System.out.print("<a"+(i+1)+".2020@kiit.ac.in>, ");
        }
        
        for(int i=0;i<b;i++)
        {
            System.out.print("<b"+(i+1)+".2020@kiit.ac.in>, ");
        }
        
        System.out.println();
        
    }
}