class year
{
    year(int l)
    {
        if(l%4==0)
        {
            System.out.println(l+" is a Leap year");
                System.out.println("Thank you for using");
        }
        else
        {
           System.out.println(l+" is NOT a Leap year");
           System.out.println("Thank you for using");
        }
    }
    year(int d, int p)
    {
        int a=p-d;
        System.out.println("Your age is "+a+" years");
            System.out.println("Thank you for using");
    }
}