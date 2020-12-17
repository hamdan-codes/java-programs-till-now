import java.io.*;
public class Multi
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s="",s1="",s2="",s11,s21,ans="";
        int l,k,k1=0,k2=0;
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=br.readLine();
            str[i]+=" ";
        }
        for(int i=0;i<n;i++)
        {
            ans="";
            s=str[i];
            k1=0;
            k2=0;
            k=0;
            while(s.charAt(k)!=' ')
                ans+=s.charAt(k++);
            k2=k+1;
            ans+=" ";
            while((k2<s.length())&&(k1<s.length()))
            {
                s1="";
                s2="";
                while(s.charAt(k1)!=' ')
                    s1=s1+s.charAt(k1++);
                k1++;
                while(s.charAt(k2)!=' ')
                    s2=s2+s.charAt(k2++);
                k2++;
                s11=s1;
                String s12=s11.toUpperCase();
                s21=s2;
                String s22=s21.toUpperCase();
                if(s12.equals(s22)==false)
                    ans+=(s2+" ");
            }
            ans=ans.trim();
            if(i==(n-1))
                System.out.print(ans);
            else
                System.out.println(ans);
        }
    }
}
