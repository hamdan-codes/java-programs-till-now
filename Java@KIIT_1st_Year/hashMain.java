import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.io.*;
class hashMain
{
    public static void main(String args[])throws IOException
    {
        String f[]={"a_example","b_read_on","c_incunabula","d_tough_choices","e_so_many_books","f_libraries_of_the_world"};
        for(int t=0;t<6;t++)
        {
            File file = new File("C:\\Users\\KIIT\\Desktop\\hashcode\\"+f[t]+".txt"); 
            BufferedReader br = new BufferedReader(new FileReader(file));
            Pattern p = Pattern.compile("[\\s]+");

            String l1[]=new String[2]; 
            l1=br.readLine().split(p.pattern());
            
            int books = Integer.parseInt(l1[0]);
            int lib   = Integer.parseInt(l1[1]);
            int days  = Integer.parseInt(l1[2]);
            
            String l2[]=new String[books];
            l2=br.readLine().split(p.pattern());
            int db[]=new int[books];
            for(int i=0;i<books;i++)
            {
                db[i]=Integer.parseInt(l2[i]);
            }
            String libl1[]=new String[3];
            int libd[][]=new int[lib][3];
            int bn[][]=new int[lib][100000];
            for(int i=0;i<lib;i++)
            {
                libl1=br.readLine().split(p.pattern());
                for(int j=0;j<3;j++)
                {
                    libd[i][j]=Integer.parseInt(libl1[j]);
                    
                }
                String libl2[]=new String[libd[i][0]];
                libl2=br.readLine().split(p.pattern());
                for(int j=0;j<libd[i][0];j++)
                {
                    if(j<libd[i][0])
                        bn[i][j]=Integer.parseInt(libl2[j]);
                    else
                        bn[i][j]=-1;
                    
                }
                
            }
            
            
            
            
            FileWriter fw=new FileWriter("C:\\Users\\KIIT\\Desktop\\hashcode\\"+f[t]+".txt");
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter of=new PrintWriter(bw);
            of.println(libd[1][1]);
            of.println(lib);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            br.close();
            of.close();
        }
    }
}