import java.io.*;
class Admit_Card
{
    public static void main(String Args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input : ");
        System.out.print("Please Enter Your School Name : ");
        String sn=br.readLine();
        System.out.print("Please Enter Session : ");
        String ss=br.readLine();
        System.out.print("Please Enter Your Name : ");
        String yn=br.readLine();
        System.out.print("Please Enter Your Class : ");
        String cl=br.readLine();
        System.out.print("Please Enter Your Roll no. : ");
        long rn=Long.parseLong(br.readLine());
        System.out.print("Please Enter Your Examination Centre : ");
        String ec=br.readLine();
        System.out.print("Please Enter Your Father's Name : ");
        String fn=br.readLine();
        System.out.print("Please Enter Your Mother's Name : ");
        String mn=br.readLine();
        System.out.println();
        System.out.println();
        System.out.println("Output : ");
        System.out.println();
        System.out.println("                "+sn+"  Session  "+ss);
        System.out.println();
        System.out.print("Name : "+yn+"                ");
        System.out.println("Class : "+cl+"             ");
        System.out.print("Roll No. : "+rn+"                      ");
        System.out.println("Examination Centre : "+ec);
        System.out.print("Father's Name : "+fn+"            ");
        System.out.println("Mother's Name : "+mn);
    }
}
