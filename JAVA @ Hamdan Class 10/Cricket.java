class Cricket
{
    public static void main(String args[])
    {
        int sum[]={0,0};
        for(int t=1;t<=2;t++)
        {
            System.out.println("For Team "+t);
            for(int b=1;b<=6;b++)
            {
                int a=(int)(Math.random()*10);
                if(a>6)
                    a=a-3;
                if(a==0)
                    a=1;
                for(int i=0;i<=1000000000;i++)
                {
                }
                System.out.println("Ball: "+b+"\t\tRun: "+a);
                if(a==5)
                {
                    a=1;
                    int e=(int)(Math.random()*10);
                    if(e>6)
                        e=e-3;
                    if(e==5)
                        e=e-1;
                    System.out.println("No ball.........Run: 1\nExtra ball......Run: "+e);
                    sum[t-1]=sum[t-1]+e;
                }
                sum[t-1]=sum[t-1]+a;
            }
            for(int i=0;i<=1000000000;i++)
            {}
            System.out.println("Total runs: "+sum[t-1]);
            for(int i=0;i<=100000000;i++)
            {}
            System.out.println(".");
            for(int i=0;i<=10000000;i++)
            {}
            System.out.println(".");
            for(int i=0;i<=100000000;i++)
            {}
            System.out.println(".");
            for(int i=0;i<=100000000;i++)
            {}
            System.out.println(".");
        }
        if(sum[0]>sum[1])
        {
            for(int i=0;i<=100000000;i++)
            {}
            System.out.println("Winner: Team 1          by  "+(sum[0]-sum[1])+" runs");
        }
        else if(sum[0]<sum[1])
        {
            for(int i=0;i<=1000000000;i++)
            {}
            System.out.println("Winner: Team 2         by   "+(sum[1]-sum[0])+"  runs");
        }
        else 
        {
            for(int i=0;i<=1000000000;i++)
            {}
            System.out.println("Match Tied");
        }
    }
}
