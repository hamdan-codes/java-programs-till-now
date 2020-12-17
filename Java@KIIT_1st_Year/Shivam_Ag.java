import java.io.*;
class Shivam_Ag
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i,j,m,n,a,arr[];
        System.out.print("Enter size of array : ");
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        System.out.println("Enter Elements : ");
        for(i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());
        System.out.print("Enter sub array size : ");
        m=Integer.parseInt(br.readLine());
        for(i=0;i<=n-m;i++)
        {
            a=0;
            for(j=i;j<i+m;j++)
                if(arr[j]<0)
                {
                    a=arr[j];
                    break;
                }
            System.out.print(a+"\t");
        }
        System.out.println();
    }
}
