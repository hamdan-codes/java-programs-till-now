import java.io.*;
class Consecutive
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Enter the Length of Array : ");
        int l=Integer.parseInt(br.readLine());
        int a[]=new int[l];
        int g=0,i=0,j=0,k=1,c=1,q=-1;
        for(i=0;i<l;i++)
        {
            System.out.print("Enter number no. "+(i+1)+" : ");
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println();
        System.out.print("Entered Array : ");
        for(i=0;i<l;i++)
            System.out.print(a[i]+"\t");
        System.out.println();
        System.out.println();
        for(i=0;i<l;i++)
        {
            for(j=(i+1);j<l;j++)
            {
                 if(a[i]>a[j])
                 {
                     g=a[i];
                     a[i]=a[j];
                     a[j]=g;
                 }
            }
        }
        System.out.print("Sorted Array  : ");
        for(i=0;i<l;i++)
            System.out.print(a[i]+"\t");
        System.out.println();
        System.out.println();
        for(i=0;i<l-1;i++)
        {
            k=1;
            for(j=i+1;j<l;j++)
            {
                if(a[j]==(a[j-1]+1))
                {
                    k++;
                }
                if(a[j]!=(a[j-1]+1))
                {
                    break;
                }
            }
            if(k>c)
            {
                q=j;
                c=k;
            }
        }
        if(c>1)
        {
            System.out.print("Most Consecutive Numbers are : ");
            for(i=q-c;i<q;i++)
            {
                System.out.print(a[i]+"\t");
            }
            System.out.println();
            System.out.println();
            System.out.println("No. of Most Consecutive numbers = "+c);
        }
        else
            System.out.println("No Consecutive Numbers Found ! ! !");
    }
}
