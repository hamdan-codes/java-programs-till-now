class Sample
{
    void myfunc()
    {
        int ar[]={16,14,5,12,3,0,1};
        int x,y=0;
        for(x=0;x<5;x++)
        {
            for(y=0;y<6-x;y++)
            {
                if(ar[y]>ar[y+1])
                {
                    int t=ar[y];
                    ar[y]=ar[y+1];
                    ar[y+1]=t;
                }
            }
        }
        System.out.println(x+"    "+y);
        for(x=0;x<7;x++)
        {
            System.out.print("        "+ar[x]);
        }
    }
    public void main()
    {
        int r;
        for(int i=0;i<5;i++)
        {
            r=recs(i);
            System.out.println(i+"\t"+r);
        }
    }
    public int recs(int num)
    {
        if(num==0)
            return 0;
        else
            return(num+recs(num-1));
    }
}














