import java.io.*;
class any_alpha
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter all things in small letters");
        System.out.println(" ");
        System.out.println("Please Enter the Sentence or word");
        String sen = br.readLine();
        System.out.println("Now Enter the alphabet you want to check the no. of times it is repeated");
        char alpha = (char)System.in.read();
        int C = 0;
        int l = sen.length();
        for(int z=0;z<l;z++)
        {
            char wor = sen.charAt(z);
            if(wor == alpha)
            {
               C++;
            }
        }
        System.out.println("The number of words in the sentence is "+C);
        System.out.println("Thank You for Using");
    }
}
