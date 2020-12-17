import java.io.*;
class BookFair
{
    String Bname;
    double price;
    
    BookFair()
    {
        Bname="";
        price=0;
    }
    
    void Input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Book name then Price : ");
        Bname=br.readLine();
        price=Double.parseDouble(br.readLine());
    }
    
    void calculate()
    {
        if(price<=1000)
            price = price-((2*price)/100);
        else if((price>1000)&&(price<=3000))
            price = price-((10*price)/100);
        else
            price = price-((15*price)/100);
    }
    
    void display()
    {
        System.out.println("Book name "+Bname+" = Rs. "+price);
    }
    
    public static void main(String args[])throws IOException
    {
        BookFair ob =new BookFair();
        ob.Input();
        ob.calculate();
        ob.display();
        System.out.println();
        System.out.println("Thank You ");
    }
}
