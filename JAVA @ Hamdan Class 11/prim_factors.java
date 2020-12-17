import java.io.*;
class prim_factors
{
    int num[];
    int size;
    prim_factors()
    {
        num=new int[0];
    }
    void readsize(int nx)
    {
        size=nx;
        if(size>200)
            size=200;
        num=new int[size];
    }
    void get_numbers()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter a number for array : ");
            num[i]=Integer.parseInt(br.readLine());
        }
    }
    void show_primeFact()
    {
        int x=0;
        for(int j=0;j<size;j++)
        {
            x=num[j];
            int s=2;
            System.out.print("Input : "+x+"    Output : ");
            while(x>1)
            {
                if(x%s==0)
                {
                    System.out.print(s+", ");
                    x=x/s;
                }
                else
                {
                   s++;
               }
            }
            System.out.println();
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size for array : ");
        int nn=Integer.parseInt(br1.readLine());
        prim_factors obj=new prim_factors();
        obj.readsize(nn);
        obj.get_numbers();
        obj.show_primeFact();
    }
}
