class Concat_Vowel_Mid
{
    public static void main(String s)
    {
        s=s.toUpperCase();
        int l=s.length();
        char c;
        int k=-1;
        System.out.println(s);
        for(int i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                k=i;
                break;
            }
        }
        String s1=s.substring(k,l)+s.substring(0,k)+'C';
        System.out.println(s1);
    }
}
