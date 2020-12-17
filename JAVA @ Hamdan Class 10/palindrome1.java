class palindrome1
{
    public static void main(int n)
    {
        int d= 0,p=0,m=n;
        while(n>0)
        {
           d=n%10;
           p=(p*10)+d;
           n=n/10;
        }
        if(p==m)
        {
            System.out.println(m+" is Palindrome");
        }
        else
        System.out.println(m+" is NOT Palindrome");
        System.out.println("Thank You for using");
    }
}
    