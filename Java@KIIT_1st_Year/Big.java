import java.util.*;
public class Big
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,n,k,a=0,b=0,p=0;
        String s;
        n=in.nextInt();
        k=in.nextInt();
        s=in.nextLine();
        s=in.nextLine();
        char c[] = s.toCharArray();
        
        for(i=0;i<(n+1)/2;i++)
        {
            if(c[i]!=c[n-1-i])
            {
                c[i]=greater(c[i],c[n-1-i]);
                c[n-1-i]=c[i];
                p++;
            }
        }
        if(p<=k)
        {
            for(i=0;i<(k-p);i++)
            {
                c[i]='9';
                c[n-1-i]=c[i];
            }
            
            for(i=0;i<n;i++)
            {
                System.out.print(c[i]);
            }
        }
        else
            System.out.print("-1");
    }
    public static char greater(char aa,char bb)
    {
        if((int)aa>(int)bb)
            return aa;
        else
            return bb;
    }
}
