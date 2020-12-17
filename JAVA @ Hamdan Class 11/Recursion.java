class Recursion
{
    public static void display(int n)
    {
        if(n>3)
        {
            System.out.println("Now n = "+n);
            n--;
            display(n);
        }
    }
}
