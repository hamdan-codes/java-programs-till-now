import java.io.*;
class employee
{
    String empname;
    int empcode;
    double basicpay,HRA,DA,salary,sa=0,tsal;
    employee()
    {
        empname="";
        empcode=0;
        basicpay=0.0;
    }
    employee(String n,int p,double q)
    {
        empname=n;
        empcode=p;
        basicpay=q;
    }
    double salarycal()
    {
        HRA=0.3*basicpay;
        DA=0.4*basicpay;
        salary=basicpay+HRA+DA;
        if(empcode<=15)
        {
            if(salary<=15000)
               sa=0.2*salary;
            if(sa>2500)
               sa=2500;
        }
        else if(empcode>15)
        {
            sa=1000;
            
        }
        tsal=salary+sa;
        System.out.println("Total Salary = "+tsal);
        return tsal;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name of Employee : ");
        String n= br.readLine();
        System.out.print("Enter Employee Code : ");
        int p= Integer.parseInt(br.readLine());
        System.out.print("Enter Basic Pay : ");
        double q= Double.parseDouble(br.readLine());
        employee ob=new employee(n,p,q);
        ob.salarycal();
        
    }
}
