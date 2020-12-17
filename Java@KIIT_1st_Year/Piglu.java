import java.io.*;
class Piglu
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String s,s1,st="";
        int l,a,b,i,n,k=0;
        char c;
        System.out.print("Enter String to be repeatedly Infinitely : ");
        s=br.readLine();
        System.out.print("Enter n : ");
        n=Integer.parseInt(br.readLine());
        l=s.length();
        a=(int)(n%l);
        b=(int)(n/l);
        s1=s.substring(0,a);
        for(i=0;i<b;i++)
            st=st+s;
        st=st+s1;
        for(i=0;i<n;i++)
        {
            c=st.charAt(i);
            if(c=='a')
                k++;
        }
        System.out.println("String = "+st);
        System.out.println("Number of a's = "+k);
    }
}
