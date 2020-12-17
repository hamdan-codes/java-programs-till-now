class _3_Evil
{
    public static void main(int n)
    {
        int m=n,k=0;
        int x=0,y=0;
        String s="";
        char c;
        while(n>0)
        {
            x=n%2;
            s=x+s;
            n=n/2;
        }
        System.out.println(s);
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c=='1')
                k++;
        }
        System.out.println("Number of 1s = "+k);
        if(k%2==0)
            System.out.println(m+" is an Evil Number");
        else
            System.out.println(m+" is NOT an Evil Number");
    }
}