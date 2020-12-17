import java.io.*;
class dec_bin
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ar= new BufferedReader( new InputStreamReader(System.in));
        int r=1,d=0,s=0;
        String kl="";
        System.out.println("Input decimal ");
        int j=Integer.parseInt(ar.readLine());
        while(j>0)
        {
            d=j%2;
            kl=kl+d;
            j=j/2;
        }
        String g="";
        for(int i=(kl.length()-1);i>=0;i--)
             g=g+(kl.charAt(i));
        System.out.println(g);
    }
}
