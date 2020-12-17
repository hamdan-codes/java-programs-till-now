import java.util.*;
class Chef_Physical_Exercise
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int it=in.nextInt();
        double dis=0.0,d1=0.0,d2=0.0,d3=0.0,min=0.0;
        for(int j=1;j<=it;j++)
        {
            int x=in.nextInt();
            int y=in.nextInt();
            int n=in.nextInt();
            int m=in.nextInt();
            int k=in.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int c[]=new int[m];
            int d[]=new int[m];
            int e[]=new int[k];
            int f[]=new int[k];
            for(int i=0;i<n;i++)
            {
                a[i]=in.nextInt();
                b[i]=in.nextInt();
            }
            for(int i=0;i<m;i++)
            {
                c[i]=in.nextInt();
                d[i]=in.nextInt();
            }
            for(int i=0;i<k;i++)
            {
                e[i]=in.nextInt();
                f[i]=in.nextInt();
            }
            
            d1=Math.pow((x-a[0]),2)+Math.pow((y-b[0]),2);
            d1=Math.sqrt(d1);
            d2=Math.pow((a[0]-c[0]),2)+Math.pow((b[0]-d[0]),2);
            d2=Math.sqrt(d2);
            d3=Math.pow((c[0]-e[0]),2)+Math.pow((d[0]-f[0]),2);
            d3=Math.sqrt(d3);
            min=d1+d2+d3;
            
            for(int nn=0;nn<n;nn++)
            {
                for(int mm=0;mm<m;mm++)
                {
                    for(int kk=0;kk<k;kk++)
                    {
                        d1=Math.pow((x-a[nn]),2)+Math.pow((y-b[nn]),2);
                        d1=Math.sqrt(d1);
                        d2=Math.pow((a[nn]-c[mm]),2)+Math.pow((b[nn]-d[mm]),2);
                        d2=Math.sqrt(d2);
                        d3=Math.pow((c[mm]-e[kk]),2)+Math.pow((d[mm]-f[kk]),2);
                        d3=Math.sqrt(d3);
                        dis=d1+d2+d3;
                        if(dis<min)
                            min=dis;
                    }
                }
            }
            System.out.println(min);
            
        }
    }
}
