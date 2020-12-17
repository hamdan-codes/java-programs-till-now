import java.util.*;
public class Anagrams
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,k,l,c;
        System.out.print("Enter no. of Elements : ");
        n=in.nextInt();
        String s[]=new String[n];
        System.out.println("Enter "+n+" Strings : ");
        s[0]=in.nextLine();
        for(i=0;i<n;i++)
            s[i]=in.nextLine();
        System.out.print("Input : ");
        for(i=0;i<n;i++)
            System.out.print("\""+s[i]+"\"  ");
        System.out.println("\n\nOutput : ");
        for(i=0;i<n;i++)
        {
            if(s[i].charAt(s[i].length()-1)!='/')
                System.out.print("\""+s[i]+"\"  ");
            for(j=i+1;j<n;j++)
            {
                c=0;
                if((s[i].length()==s[j].length())&&(s[j].charAt(s[j].length()-1)!='/'))
                {
                    for(k=0;k<s[i].length();k++)
                        for(l=0;l<s[j].length();l++)
                            if(s[i].charAt(k)==s[j].charAt(l))
                            {
                                c++;
                                break;
                            }
                    if(c==s[i].length())
                    {
                        System.out.print("\""+s[j]+"\"  ");
                        s[j]+='/';
                    }
                }
            }
            if(s[i].charAt(s[i].length()-1)!='/')
                System.out.println();
        }
    }
}
