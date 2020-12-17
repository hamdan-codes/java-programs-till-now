import java.io.*;
class Mixer
{
    String x="",y="";
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First");
        x=br.readLine();
        System.out.println("Enter Second");
        y=br.readLine();
        
    }
    String mix(Mixer p,Mixer q)
    {
        return (p.x+"   "+q.x+"                          "+p.y+"    "+q.y);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Mixer a=new Mixer();
        Mixer b=new Mixer();
        Mixer c=new Mixer();
        a.input();
        b.input();
        String ans=c.mix(a,b);
        System.out.println(ans);
    }
}
