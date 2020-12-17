import java.util.*;
public class Encrypt
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int r,c,k=0,i,j;
        String s=in.nextLine();
        int l=s.length();
        int a=(int)Math.sqrt(l);
        if(a*a==l)
        {
            r=a;
            c=a;
        }
        else if(a*(a+1)>=l)
        {
            r=a;
            c=a+1;
        }
        else
        {
            r=a+1;
            c=a+1;
        }
        char ch[][]=new char[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(k<l)
                    ch[i][j]=s.charAt(k++);
                else
                    ch[i][j]='0';
            }
        }
        for(j=0;j<c-1;j++)
        {
            for(i=0;i<r;i++)
            {
                if(ch[i][j]!='0')
                    System.out.print(ch[i][j]);
                else
                    continue;
            }
            System.out.print(" ");
        }
        for(i=0;i<r;i++)
        {
            if(ch[i][j]!='0')
                System.out.print(ch[i][j]);
            else
                continue;
        }
        //System.out.print();
    }
}