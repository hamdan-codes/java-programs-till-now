import java.util.*;
public class Time
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        s=in.nextLine();
        if(((s.charAt(8)=='A')&&(s.charAt(0)!='1'&&s.charAt(1)!=2))||(s.charAt(8)=='P')&&(s.charAt(0)=='1')&&(s.charAt(1)=='2'))
        {
            System.out.print(s.substring(0,8));
        }
        if((s.charAt(8)=='A')&&(s.charAt(0)=='1'&&s.charAt(1)=='2'))
        {
            System.out.print("00"+s.substring(2,8));
        }
        if((s.charAt(8)=='P')&&(s.charAt(0)=='0')&&(s.charAt(1)<='7'))
        {
            System.out.print((char)((int)(s.charAt(0))+1)+""+(char)((int)(s.charAt(1))+2)+""+s.substring(2,8));
        }
        if((s.charAt(8)=='P')&&(s.charAt(0)=='0')&&(s.charAt(1)=='8'||s.charAt(1)=='9'))
        {
            System.out.print((char)((int)(s.charAt(0))+2)+""+(char)((int)(s.charAt(1))-8)+""+s.substring(2,8));
        }
        if((s.charAt(8)=='P')&&(s.charAt(0)=='1')&&(s.charAt(1)=='0'||s.charAt(1)=='1'))
        {
            System.out.print((char)((int)(s.charAt(0))+1)+""+(char)((int)(s.charAt(1))+2)+""+s.substring(2,8));
        }
    }
}