import java.io.*;
class Smith_Number
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Enter a Number to check it as SMITH Number : ");
        int n=Integer.parseInt(br.readLine());
        int m=n;
        int a=0,b=0,d=0,sp=0;
        while(m>0)
        {
            a=m%10;
            d=d+a;
            m=m/10;
        }
        m=n;
        int x=0,y=0,z=1;int k=0,cc=0,p=1;
            for(int i=2;i<=m;i++)
            {
                k=0;
                for(int j=2;j<=i;j++)
                {
                    if(i%j==0)
                        k++;
                }
                if(k==1&&m%i==0)
                {
                    z=i;
                    m=m/i;
                    if(i>9)
                    {
                        cc=i;
                        while(cc>0)
                        {
                            a=cc%10;
                            b=b+a;
                            cc=cc/10;
                        }
                        z=b;
                    }
                    sp=sp+z;
                }
                if(m%i==0)
                {
                    i--;
                }
            }
            if(sp==d)
                System.out.println(n+" is a SMITH number ");
            else
                System.out.println(n+" is a NOT Smith number ");
            
            System.out.println("Sum of digits of Prime Factors = "+sp);
            System.out.println("Sum of digits                  = "+d);
        
    }
}







