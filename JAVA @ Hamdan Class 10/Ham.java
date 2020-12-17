import java.io.*;
class Ham
{
    int a,b,sum,pro,div,sub;
    void accept()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Value of a : ");
        a=Integer.parseInt(br.readLine());
        System.out.print("Value of b : ");
        b=Integer.parseInt(br.readLine());
    }
    void calculate()
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        sum=a+b;
        pro=a*b;
        div=a/b;
        sub=a-b;
    }
    void display()
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Sum         = "+sum);
        System.out.println("Subtraction = "+sub);
        System.out.println("Product     = "+pro);
        System.out.println("Division    = "+div);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Ham ob=new Ham();
        System.out.println("Input : ");
        ob.accept();
        ob.calculate();
        System.out.println("Output : ");
        ob.display();
    }
}
