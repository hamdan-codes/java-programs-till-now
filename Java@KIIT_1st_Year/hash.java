import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.io.*;
class hash
{
    public static void main(String args[])throws IOException
    {
        String f[]={"a_example","b_small","c_medium","d_quite_big","e_also_big"};
        for(int t=0;t<5;t++)
        {
            File file = new File("C:\\Users\\KIIT\\Desktop\\practice\\"+f[t]+".in"); 
            BufferedReader br = new BufferedReader(new FileReader(file));
            Pattern p = Pattern.compile("[\\s]+");

            String fl[]=new String[2]; 
            fl=br.readLine().split(p.pattern());
            
            
            
            int tp = Integer.parseInt(fl[0]);
            int n  = Integer.parseInt(fl[1]);
            int sum=0;
            String pizza[]=br.readLine().split(p.pattern());
            int pi[]=new int[n];
            String ans="";
            int c=0,k=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                pi[i]=Integer.parseInt(pizza[i]);
            }
            for(int i=n-1;i>=0;i--)
            {
                if(pi[i]+c<=tp)
                {
                    c+=pi[i] ;
                    ans = i+" "+ans;
                    k++;
                }
            }
            
            FileWriter fw=new FileWriter("C:\\Users\\KIIT\\Desktop\\practice\\"+f[t]+".out");
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter of=new PrintWriter(bw);
            of.println(k);
            of.println(ans);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            br.close();
            of.close();
        }
    }
}