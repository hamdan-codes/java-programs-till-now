import java.io.*;
class Change_Case
{
    public static void main(String args[])throws IOException
      {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the Alphabet of which you want to change case");
        char a= (char)System.in.read();
        char a1= a;
        int z = 0,y=0;
        
        if((a>='A')&&(a<'a'))
        {
            for(z=1;z<=32;z++)
            {
                 a++;
            }
            System.out.println(a);
        }
        
        if((a1>='a')&&(a1<='z'))
        {
            for(y=1;y<=32;y++)
            {
                 a1--;
            }
            System.out.println(a1);
        }
        
        System.out.println("Thank You for Using");
      }
}