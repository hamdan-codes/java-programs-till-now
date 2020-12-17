class _20_Twin_Prime
{
    public static void main(int Range_from,int Range_to)
    {
        int a=Range_from,b=Range_to;int k1=0,k2=0;
        if(a==1)
            a=2;
        for(int i=a;i<b-1;i++)
        {
            k1=0;k2=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    k1++;
            }
            for(int j=2;j<i+2;j++)
            {
                if((i+2)%j==0)
                    k2++;
            }
            if(k1==0&&k2==0)
            {
                System.out.print("("+i+","+(i+2)+") ");
            }
        }
    }
}
