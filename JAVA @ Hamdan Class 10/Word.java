class Word
{
    public static void main(String s)
    {
        String word=s;
        int a=0,b=0;
        char c,d,d1;
        String s1="";
        int l=word.length();
        for(a=l-1;a>=0;a--)
        {
            c=word.charAt(a);
            s1=s1+c;
        }
        d=word.charAt(0);
        d1=word.charAt(l-1);
        if(s1.equals(s))
            System.out.println("Palindrome Word ");
        else if(d==d1)
            System.out.println("Special Word ");
        else 
            System.out.println("Neither Special nor Palindrome");
        System.out.println();
        System.out.println("Thank You ");
    }
}
