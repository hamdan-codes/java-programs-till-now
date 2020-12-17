class Palindrome_Num
{
    void palindrome(int a)
    {
        int n=a,c=0,p=0,stp=-1,x=0,m=0,nn=a;
        if(a>9)
        {
            while(p!=n)
            {
                n=n+p;
                m=n;
                p=0;
                while(n>0)
                {
                    x=n%10;
                    p=(p*10)+x;
                    n=n/10;
                }
                n=m;
                stp++;
                if(stp>15)
                {
                    c=1;
                    break;
                }
            }
            if(c!=1)
            {
                System.out.println("Original Number = "+a+"....\t Palindrome      = "+p+" ....\t Found After Completion of "+stp+" Steps...");
            }
            /*else if(c==1)
            {
                System.out.println("Original Number = "+a);
                System.out.println("No Palindrome Number found upto step 15 Sorry  !!!!");
            }*/
        }
        else
            System.out.println("Wrong Entry !!!!");
    }
}







