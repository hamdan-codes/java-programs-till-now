class _11_Unique
{
    public static void main(int n)
    {
        int m=n;
        String s=""+m;
        int l=s.length();
        int i=0,j=0,k=0;
        char c,d;
        for(i=0;i<l-1;i++)
        {
            c=s.charAt(i);
            for(j=i+1;j<l;j++)
            {
                d=s.charAt(j);
                if(c==d)
                    k=1;
            }
        }
        if(k==1)
            System.out.println(m+" is NOT a Unique Number");
        else
            System.out.println(m+" is a Unique Number");
    }
}