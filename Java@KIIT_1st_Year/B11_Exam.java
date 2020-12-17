class B11_Exam
{
    public static void main(int n)
    {
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>i;j--)
                System.out.print(" \t");
            for(int j=1;j<=i;j++)
                System.out.print(j+"\t");
            for(int j=i-1;j>=1;j--)
                System.out.print(j+"\t");
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}
