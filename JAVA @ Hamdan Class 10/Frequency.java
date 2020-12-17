import java.io.*;
class Frequency
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j,f;
        System.out.println("ENTER A STRING IN UPPER CASE ");
        String s=br.readLine();
        int l=s.length();
        char c,i;
        System.out.println("CHARACTERS   FREQUENCY");
        for(i='A';i<='Z';i++)
        {
            f=0;
            for(j=0;j<l;j++)
            {
                c=s.charAt(j);
                if(c==i)
                {
                    f++;
                }
            }
            if(f>0)
            {
                System.out.println("    "+i+"            "+f);
            }
        }
    }
}
