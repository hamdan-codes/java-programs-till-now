import java.io.*;
import java.util.*;
class String_Check
{
    public static void  main(String[]ar)throws IOException
    {
      try
      {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String : ");
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        int l=st.countTokens();
        System.out.println("No. of Strings = "+l);
        String s1="";
        for(int i=1;i<=l+1;i++)
        {
            s=st.nextToken();
            System.out.println(" String no. "+i+" = "+s);
        }
        Double obj=new Double(5.4);
        System.out.println("The Error Display is down   :  ");
      }
      catch(Exception e)
      {
        System.err.print(e);
      }
    }
}