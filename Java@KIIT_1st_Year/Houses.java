import java.util.*;
class Houses
{
    int main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int ans[]=new int[t];
        for(int j=0;j<t;j++)
        {
            int m=sc.nextInt();
            int n[]=new int[m];
            int b=sc.nextInt();
            int sum=0,k=0;
            for(int i=0;i<m;i++)
            {
                n[i]=sc.nextInt();
            }
            
            int g=0;
            for(int z=0;z<m;z++)
           {
                for(int jj=z+1;jj<m;jj++)
                {
                     if(n[z]>n[jj])
                     {
                         g=n[z];
                         n[z]=n[jj];
                         n[jj]=g;
                        }
                 }
           }
            
            for(int i=0;i<m;i++)
            {
                sum=n[i]+sum;
                if(sum<=b)
                    k++;
                else
                    break;
            }
            ans[j]=k;
            
            
            
            
        }
        
        
        
        for(int j=0;j<t;j++)
            System.out.println("Case #"+(j+1)+": "+ans[j]);
            return 0;
        }
}









