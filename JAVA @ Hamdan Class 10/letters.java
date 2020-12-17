import java.io.*;
class letters
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the Sentence to check how many uppercase and lowercase letters are used");
        String sen = br.readLine();
        String sen1 = sen;
        int a=0;
        int b=0;
        int l = sen.length();
        int l1 = sen1.length();
        for(int z= 0;z<l;z++)
        {
            char wor = sen.charAt(z);
            if ((wor >='A')&&(wor<='Z'))
            {
            a++;
        }
    }
     for(int z= 0;z<l1;z++)
     {
            char wor = sen1.charAt(z);
            if ((wor >='a')&&(wor<='z'))
            {
            b++;
        }
    }
    System.out.println("The no. of times the CAPITAL letters are used in this sentence is "+a);
    System.out.println("The no. of times the small letters are used in this sentence is "+b);
    System.out.println("Thank You for Using");
}
}