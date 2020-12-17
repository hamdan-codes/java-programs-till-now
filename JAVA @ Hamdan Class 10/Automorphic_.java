class Automorphic_
{
    public static void main(int a)
    {
        int n=a,flag=0;
        int s=n*n;
        while(n>0)
        {
            if(n%10!=s%10)
            {
                flag =1;
                break;
            }
            else
            {
                n=n/10;
                s=s/10;
            }
        }
        if(flag==0)
        {
            System.out.println("Automorphic");
        }
        else
        {
            System.out.println("Not Automorphic");
        }
    }
}
