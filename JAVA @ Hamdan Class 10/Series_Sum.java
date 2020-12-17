import java.io.*;
class Series_Sum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the Number To which You Want The Sum");
        System.out.println("Example : 1-2+3-4+5.....+-n");
        int n=Integer.parseInt(br.readLine());
        int add=0,sub=0;
        for(int s=1;s<=n;s++)
        {
            if(s%2==0)
                 sub=sub+s;
            else
                 add=add+s;
        }
        int sum = add-sub;
        System.out.println("Answer of the Sum of Series is :    "+sum);
        System.out.println("Thank You for Using");
    }
}
