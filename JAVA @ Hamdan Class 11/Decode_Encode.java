import java.io.*;
class Decode_Encode
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your message : ");
        String s=br.readLine();
        int l=s.length();
        int i=0,j=0,ii=0,jj=0,ll;
        char c,d;
        String ans="";
        String o="",p="";
        System.out.println("Decoded Message : "+s);
        System.out.print("Encoded Message : ");
        System.out.print(23);
        while(l>0)
        {
            o="";
            p="";
            ans="";
            jj=0;
            c=s.charAt(l-1);
            i=(int)c;
            o=o+i;
            j=i;
            ll=o.length();
            for(int y=ll-1;y>=0;y--)
            {
                d=o.charAt(y);
                p=p+d;
            }
            ans=ans+p;
            l--;
            System.out.print(ans);
        }
        System.out.println();
    }
}
