import java.io.*;
class Armstrong
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter The number for Armstrong Check");
        int n = Integer.parseInt(br.readLine());
        int a= 0, b= 0,m=n;
        while(n>0)
        {
        a= n%10;
        b= (a*a*a)+b;
        n= n/10;
    }
    int ans = b;
    if(ans==m)
    {
        System.out.println("The number "+m+" is an Armstrong number");
    }
    else
    {
        System.out.println("The number "+m+" is 'NOT' an Armstrong number");
    }
    System.out.println("Thank You for Using");
}
}
