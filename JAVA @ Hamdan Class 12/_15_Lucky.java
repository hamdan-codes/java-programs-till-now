class _15_Lucky
{
    public static void main(int n)
    {
        int m=n;
        int a[]=new int[n];
        int k=1;
        for(int i=0;i<n;i++)
            a[i]=i+1;
        while(n>k)
        {
            for(int i=k;i<n;i+=k)
            {
                for(int j=i;j<n-1;j++)
                    a[j]=a[j+1];
                n--;
            }
            k++;
            for(int i=0;i<n;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
        System.out.print("Hence, Lucky Numbers less than "+m+" are : ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}