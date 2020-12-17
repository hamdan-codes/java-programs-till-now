import java.io.*;
class Pattern
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Enter the length of Pattern : ");
        int l=Integer.parseInt(br.readLine());
        int c=0;
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=l;j++)
            {
                if(j<i)
                    c=i;
                else
                    c=j;
                System.out.print(c+"\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
