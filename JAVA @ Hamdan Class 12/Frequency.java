import java.io.*;
class Frequency
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Enter the Number : ");
        String s=br.readLine();
        int k=0;
        int l=s.length();
        char c;
        int a=0;
        for(int i=0;i<=9;i++)
        {
            k=0;
            for(int j=0;j<l;j++)
            {
                c=s.charAt(j);
                a=((int)c)-48;
                if(a==i)
                {
                    k++;
                }
            }
            if(k!=0)
                System.out.println("Frequency of "+i+" = "+k);
        }
    }
}
