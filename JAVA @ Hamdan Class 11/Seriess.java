class Seriess
{
  void series(int n)
  {
    int a=0,b=1,c=0;
    double q=0.0,s=1.0;
    System.out.print(b);
    for(a=1;a<n;a++)
    { 
      for(int j=1;j<=a;j++)
        {
             b=b*j;
                q=(double) 1/b;
    }
      s=s+q;
      b=1;
    }
     System.out.println("="+s);
  }
  void tribonacci(int y)
  {
    int a=0,b=1,c=2,d=0;
    System.out.print(a+" "+b+" "+c);
    for(int i=4;i<=y;i++)
    {
        d=a+b+c;
        System.out.print(" "+d);
        a=b;
        b=c;
        c=d;       
    }  
  
}
void reverse(int h)
{
  System.out.println("Original no."+h);  
  int a=0,b=0;
  while(h>0)
  {
    a=h%10;
    b=(b*10)+a;
    h=h/10;
  }
  System.out.println("Reversed no."+b);
}
void duseries(int d,int x)
{
  int a=0,b=1;double c=0.0,w=0.0;  
  for(int i=1;i<=d;i++)
  {
     b=b*i;
     if(i%2==0)
     {
       c=Math.pow(x,i)/b;  
       w=w-c;
       System.out.print(w);
     }
     else
     {
       c=(double)Math.pow(x,i)/b;  
       w=w+c;
       System.out.print("+"+w);
     } 
    
  }
  System.out.print("="+w);
}
void akhariseries(int a,int n)
{
  double s=0.0,c;
  for(int i=1;i<=n;i=i+3)
  {
     c=Math.pow(a,(i+1)); 
      s=(double)s+(i/c);
      
}
System.out.print(s);
}
}