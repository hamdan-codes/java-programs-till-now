import java.io.*;
class binary_eq
{
    public static void main(String args[])throws IOException
    {
        BufferedReader ar= new BufferedReader( new InputStreamReader(System.in));
        System.out.println(" 1. Binary to decimal");
        System.out.println(" 2. Decimal to binary");
        int ch=Integer.parseInt(ar.readLine());
        int r=1,d=0,s=0;
        String kl="";
        switch (ch)
        {
            case 1:
            System.out.println("Input binary");
            int bn=Integer.parseInt(ar.readLine());
            while(bn>0)
            {
                d=bn%10;
                if(d==1)
                     s=s+(d*r);
                r=r*2;
                bn=bn/10;
            }
            System.out.println(s);
            break;
            case 2:
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
             break;
        }
    }
}
