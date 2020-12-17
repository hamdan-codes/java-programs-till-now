import java.util.*;
class Rajarshi
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,m,i=0,j=0,k=0,sum=0,ans=0,it,c=0;
        it=in.nextInt();
        int an[]=new int[it];
        for(int ii=1;ii<=it;ii++)
        {
            n=in.nextInt();
            m=in.nextInt();
            int ar[]=new int[n];
            for(i=0;i<n;i++)
                ar[i]=in.nextInt();
            for(i=1;i<=n;i++)
                for(j=0;j<=n-i;j++)
                {
                    for(k=j;k<i+j;k++)
                        sum=sum+ar[k];
                    if((sum%m)>ans)
                        ans=(sum%m);
                    sum=0;
                }
            an[c++]=ans;
        }
        for(i=0;i<it;i++)
            System.out.print(an[i]+" ");
    }
}
