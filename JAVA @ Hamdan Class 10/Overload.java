class Overload
{
    char c;
    String n="";
    String First_name, Last_name;
    void Accept()
    {
        First_name ="Virat";
        Last_name  ="Kohli";
    }
    void Short()
    {
        c=First_name.charAt(0);
        n=c+" "+Last_name;
    }
    void Display()
    {
        System.out.println("Original Name : "+First_name+" "+Last_name);
        System.out.println("Short name : "+n);
    }
    public static void main()
    {
        Overload ob=new Overload();
        ob.Accept();
        ob.Short();
        ob.Display();
    }
}
