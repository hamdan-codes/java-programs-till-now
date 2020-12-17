import java.io.*;
class Encode_Decode
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        String s1="2312179862310199501872379231018117927";
        String s2="23511011501782351112179911801562340161171141148";
        System.out.println("Which String do you want to choose ? ");
        System.out.println("1. 2312179862310199501872379231018117927");
        System.out.println("2. 23511011501782351112179911801562340161171141148");
        System.out.println("   OR Your own code or Any other code Press Any other Number key");
        System.out.print("Enter your Choice : ");
        int q=Integer.parseInt(br.readLine());
        if(q==1)
            s=s1;
        else if(q==2)
            s=s2;
        else
        {
            System.out.println("Enter the Encoded message");
            System.out.println("Do NOT Enter any 2 digit Encoded message");
            s=br.readLine();
        }
        int l=s.length();
        String ss=s,ans="";
        int i=0,j=0,k=0,m,n;
        char c,d,e,x,y,z;
        int hh=0;
        c=s.charAt(l-1);
        while(l>2)
        {
            c=s.charAt(l-1);
            d=s.charAt(l-2);
            e=s.charAt(l-3);
            i=((int)c)-48;
            j=((int)d)-48;
            k=((int)e)-48;
            m=(i*10)+j;
            n=(i*100)+(j*10)+k;
            if(m==32||(m>=65&&m<=90)||m>=97)
            {
                x=(char)m;
                ans=ans+x;
                s=s.substring(0,l-2);
            }
            else if(n<=122)
            {
                x=(char)n;
                ans=ans+x;
                s=s.substring(0,l-3);
            }
            l=s.length();
        }
        System.out.println("Encoded Message : "+ss);
        System.out.println("Decoded Message : "+ans);
    }
}
