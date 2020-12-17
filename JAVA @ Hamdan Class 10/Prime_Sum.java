class Prime_Sum
{
    public static void main(int length)
    {
      int a=0,b=0,c=0,p=0;
      int l=length;
      System.out.println("Prime Numbers : ");
      for(p=2;p<=l;p++)
      {
        c=0;
        for(a=2;a<=p;a++)
        {
            if (p%a==0)
                c++;
        }
        if(c==1)
        {
            b=b+p;
            System.out.print(p+"  ");
        }
      }
      System.out.println();
      System.out.println();
      System.out.println("Sum of Prime Numbers between 1 and 100 = "+b);
    }
}
