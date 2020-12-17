import java.io.*;
class Vowels
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the Sentence or word to check the no. of vowels present ");
        String sen = br.readLine();
        int C = 0;
        int l = sen.length();
        for(int z= 0;z<l;z++)
        {
            char wor = sen.charAt(z);
            if((wor == 'a') || (wor == 'e')||(wor == 'i')||(wor == 'o')||(wor == 'u')||(wor == 'A') || (wor == 'E')||(wor == 'I')||(wor == 'O')||(wor == 'U'))
            {
            C++;
        }
        }
        System.out.println("The number of words in the sentence is "+C);
        System.out.println("Thank You for Using");
    }
}
