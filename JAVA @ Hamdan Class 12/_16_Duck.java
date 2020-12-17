class _16_Duck
{
    public static void main(String s)
    {
        int l=s.length();
        int k=0;
        char c,d;
        for(int i=1;i<l;i++)
        {
            c=s.charAt(i);
            if(c=='0')
                k++;
        }
        d=s.charAt(0);
        if(k>0&&d!='0')
            System.out.println(s+" is a Duck Number");
        else
            System.out.println(s+" is NOT a Duck Number");
    }
}