import java.io.*;
import java.util.*;
import java.util.Arrays;
class Circle
{
    public static void main(String args[])throws IOException
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int ans[]=new int[t];
        for(int z=0;z<t;z++)
        {
            int n=in.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int s=0;
            for(int i=0;i<n;i++)
                a[i]=in.nextInt();
            for(int i=0;i<n;i++)
                b[i]=in.nextInt();
            
            Arrays.sort(a);
            Arrays.sort(b);
            
            for(int i=0;i<n;i++)
            {
                if(a[i]<b[i])
                    s=s+a[i];
                else
                    s=s+b[i];
            }
            ans[z]=s;
        }
        
        for(int z=0;z<t;z++)
        {
            System.out.println(ans[z]);
        }
    }
    
}
