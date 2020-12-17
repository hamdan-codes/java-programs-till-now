import java.io.*;
class Sentence
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the Sentence for its no. of words check ");
        String sen = br.readLine();
        int C = 1;
        int l = sen.length();
        for(int z= 0;z<l;z++)
        {
            char wor = sen.charAt(z);
            if(wor == ' ')
               C++;
        }
        System.out.println("The number of words in the sentence is "+C);
        System.out.println("Thank You for Using");
    }
}
