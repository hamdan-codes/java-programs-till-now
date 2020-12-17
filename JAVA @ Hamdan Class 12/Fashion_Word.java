import java.util.*;
class Fashion_Word
{
    public static void main(String s,int m,int n)
    {
        int b[]={m,n};
        int q=0;
        StringTokenizer st=new StringTokenizer(s);
        int l=st.countTokens();
        int l1=0;
        String  a[]=new String[l];
        String aa[]=new String[l];
        String ss="";
        char c,d;
        int x=0,y=0;
        System.out.print("Entered String : ");
        for(int i=0;i<l;i++)
        {
            a[i]=st.nextToken();
            aa[i]="";
            System.out.print(a[i]+" ");
        }
        System.out.println();
        if(m!=n)
            q=2;
        else
            q=1;
        for(int i=0;i<q;i++)
        {
            ss=a[(b[i]-1)];
            l1=ss.length();
            for(int j=0;j<l1;j++)
            {
                c=ss.charAt(j);
                x=((int)c)+1;
                d=(char)x;
                if(c=='z')
                    d='a';
                if(c=='Z')
                    d='A';
                aa[(b[i]-1)]=aa[(b[i]-1)]+d;
            }
        }
        System.out.print("Output String : ");
        for(int i=0;i<l;i++)
        {
            if(i==(m-1))
                System.out.print(aa[m-1]+" ");
            else if(i==(n-1))
                System.out.print(aa[n-1]+" ");
            else 
                System.out.print(a[i]+" ");
        }
    }
}
