class pronic
{
    public static void main(int n)
    {
        int i=0;
        int a=0,b=0,c=1;
        for(i=0;i<=n;i++)
        {
            a=i*(i+1);
            if(a==n)
            {
                b=2;
                break;
            }
        }
            if(b==2)
                System.out.println(n+" is Pronic Number of "+i+" and "+(i+1));
            else
                System.out.println(n+" is NOT Pronic Number");
                
        
    }
}
