class Disp extends Calc
{
    Disp(int a)
    {
        super(a);
        System.out.println("Constructor ");
    }
    void show()
    {
        super.show(7);
        System.out.println("Hello ");
    }
    void inter(int l,int k)
    {
        super.show(k);
    }
    public static void main(int y,int z)
    {
        Disp ob=new Disp(y);
        ob.inter(y,z);
        ob.show();
    }
}
