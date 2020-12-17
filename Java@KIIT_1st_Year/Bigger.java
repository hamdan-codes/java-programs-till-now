import java.util.*;
import java.util.Arrays; 
public class Bigger
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        //int it=in.nextInt();
        //for(int qq=0;qq<it;qq++)
        {
            int i,j,k=0,x=0,y,a=0,b=0;
            char c,d,e='A',cc,nc='A',sw='A';
            String ans="";
            String s=in.nextLine();
            int l=s.length();
            for(i=0;i<l-1;i++)
            {
                if(s.charAt(i)>=s.charAt(i+1))
                {
                    k++;
                    break;
                }
            }
            if(k==l-1)
                System.out.print("no answer");
            else
            {
                for(i=l-1;i>=1;i--)
                {
                    c=s.charAt(i);
                    d=s.charAt(i-1);
                    if(c>d)
                    {
                        e=d;
                        x=i;
                        break;
                    }
                }
                cc=e;
                cc++;
                for(char ii=cc;ii<='z';ii++)
                {
                    for(i=x+1;i<l;i++)
                    {
                        if(ii==s.charAt(i))
                        {
                            nc=s.charAt(i);
                            b++;
                            break;
                        }
                    }
                    if(b>0)
                        break;
                }
                if(nc=='A')
                    System.out.print((s.substring(0,x-1)));
                else
                    System.out.print((s.substring(0,x))+""+nc);
                char tempArray[] = (s.substring(x-1,l)).toCharArray();
                Arrays.sort(tempArray);
                String anss= new String(tempArray);
                for(i=0;i<anss.length();i++)
                {
                    if(anss.charAt(i)==nc)
                        continue;
                    System.out.print(anss.charAt(i));
                }
            }
            System.out.println();
        }
    }
}